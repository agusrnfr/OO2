package ar.edu.unlp.info.oo2.ejercicio5_filesystem;



import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;


class DirectorioTest {

    private Directorio vacio;
    private Directorio conUnArchivo;
    private Directorio conVariosArchivos;
    private Directorio conSubdirectorios;
    private Archivo grande;
    private Archivo backup2015;

    @BeforeEach
    void setUp() throws Exception {

        LocalDate date = LocalDate.of(2015, 1, 1);
        grande = new Archivo("grande.tmp", LocalDate.of(2016, 4, 2), 2000000);
        backup2015 = new Archivo("2015.zip", LocalDate.of(2016, 4, 6), 240000000);
        Directorio mysql = new Directorio("mysql", date);
        mysql.agregar(new Archivo("mysql01.log", LocalDate.of(2015, 12, 3), 1200000));
        mysql.agregar(new Archivo("mysql02.log", LocalDate.of(2014, 3, 3), 2000000));
        mysql.agregar(new Archivo("mysql03.log", LocalDate.of(2013, 3, 21), 2000000));
        mysql.agregar(new Archivo("mysql04.log", LocalDate.of(2014, 7, 15), 2000000));
        Directorio older = new Directorio("older", date);
        older.agregar(backup2015);
        mysql.agregar(older);
        Directorio postgres = new Directorio("postgres", date);
        postgres.agregar(new Archivo("pg01.log", LocalDate.of(2015, 4, 12), 1400000));
        postgres.agregar(new Archivo("pg02.log", LocalDate.of(2016, 3, 8), 4000000));
        postgres.agregar(new Archivo("pg03.log", LocalDate.of(2016, 2, 13), 4000000));
        // Directorio vacío
        vacio = new Directorio("home", date);
        //"Directorio con un solo archivo"
        conUnArchivo = new Directorio("var", date);
        Archivo config = new Archivo("config.bak", LocalDate.of(2016, 4, 2), 128);
        conUnArchivo.agregar(config);
        // Directorio con varios archivos, pero sin subdirectorios"
        conVariosArchivos = new Directorio("tmp", date);
        conVariosArchivos.agregar(new Archivo("nada.tmp", LocalDate.of(2015, 5, 1), 0));
        conVariosArchivos.agregar(new Archivo("chico.tmp", LocalDate.of(2013, 6, 3), 10));
        conVariosArchivos.agregar(grande);
        conVariosArchivos.agregar(new Archivo("mediano.tmp", LocalDate.of(1995, 11, 23), 10000));
        //Directorio con subdirectorios, archivos, y archivos dentro de los subdirectorios"
        conSubdirectorios = new Directorio("log", date);
        conSubdirectorios.agregar(new Archivo("sys.log", LocalDate.of(2016, 3, 3), 90000));
        conSubdirectorios.agregar(mysql);
        conSubdirectorios.agregar(postgres);
    }

    @Test
    void testArchivoMasGrande() {
        assertEquals(null, vacio.archivoMasGrande());
        assertEquals("config.bak", conUnArchivo.archivoMasGrande().getNombre());
        assertEquals(grande, conVariosArchivos.archivoMasGrande());
        assertEquals(backup2015, conSubdirectorios.archivoMasGrande());
    }

    @Test
    void testArchivoMasNuevo() {
        assertEquals(null, vacio.archivoMasNuevo());
        assertEquals("config.bak", conUnArchivo.archivoMasNuevo().getNombre());
        assertEquals(grande, conVariosArchivos.archivoMasNuevo());
        assertEquals(backup2015, conSubdirectorios.archivoMasNuevo());
    }

    @Test
    void testTamanoTotalOcupado() {
        assertEquals(32, vacio.tamanoTotalOcupado());
        assertEquals(160, conUnArchivo.tamanoTotalOcupado()); //32 del directorio + 128 del archivo
        assertEquals(2010042, conVariosArchivos.tamanoTotalOcupado()); //  2M de grande + 10K + 0 + 10 + 32 directorio
        assertEquals(256690128, conSubdirectorios.tamanoTotalOcupado());
    }


}
