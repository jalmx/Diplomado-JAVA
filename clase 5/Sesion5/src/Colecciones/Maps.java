package Colecciones;

import java.util.HashMap;
import java.util.UUID;

public class Maps {

    public static void main(String[] args) {
        
        HashMap<Integer,String> mapa = new HashMap<>();
        
        mapa.put(1, "valor 1");
        mapa.put(2, "valor 11");
        mapa.put(3, "valor 111");
        
        System.out.println(mapa.get(2));
        System.out.println(mapa.size());
        
        HashMap<String, Object> mapa2 = new HashMap<>();
        
        mapa2.put("id1", false);
        mapa2.put("id2", mapa);
        mapa2.put("id4", "texto");
        
        System.out.println(mapa2.size());
        
        System.out.println(mapa2.get("id2"));
        
        HashMap<String,String> personas = new HashMap<>();
        personas.put("name", "José");
        personas.put("age", "20");
        personas.put("mail", "correo@mail.com");
        
        HashMap<String,HashMap> usuarios = new HashMap<>();
        String id = UUID.randomUUID().toString();
        System.out.println(id);
        usuarios.put(id, personas);
        
        System.out.println(usuarios.get(id));
    }
    
}
