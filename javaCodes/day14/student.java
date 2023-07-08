package javaCodes.day14;

import java.beans.Transient;
import java.io.Serializable;

public class student implements Serializable {

    private static final long serialVersionUID = 1L;

    @Transient
    private int id;

    private String name;

    private String class_name;

}

// SOME QUESTIONS ON COLLECTIONS

// List vs set vs hashmP
// HASHMAP VS CONCURENNT HASHMAP
// USE OF HASHMAP
