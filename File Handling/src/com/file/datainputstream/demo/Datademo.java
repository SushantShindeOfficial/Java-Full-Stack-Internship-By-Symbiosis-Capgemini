package com.file.datainputstream.demo;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Datademo implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = 2080607036227796217L;

	void demo() throws IOException {

        Datademo d1 = new Datademo();

        File f1 = new File("demo.txt");

        FileOutputStream f2 = new FileOutputStream(f1);

        try (ObjectOutputStream o = new ObjectOutputStream(f2)) {

            o.writeObject(d1);

        }
    }

    
}