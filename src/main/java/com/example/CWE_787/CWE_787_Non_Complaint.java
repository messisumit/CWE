package com.example.CWE_787;

public class CWE_787_Non_Complaint {
    public static void main(String[] args) {
        //Out-of-bounds Write

        int[] id_sequence = new int[3];

        id_sequence[0] = 123;
        id_sequence[1] = 234;
        id_sequence[2] = 345;
        id_sequence[3] = 456;

        for (int i=0;i<id_sequence.length;i++)
            System.out.println(id_sequence[i]);

    }
}
