package equality;

public class Equality {
    /** Shows the different equality tests available */
    public static void main(String[] args) {
        {
            final int i1 = 5;
            final int i2 = 5;
            final int i3 = i1;
            //Voor primitieve types gebruik je ==
            boolean gelijk = i1 == i2;
            System.out.println("i1 en i2 zijn gelijk? " + gelijk);
            gelijk = i1 == i3;
            System.out.println("i1 en i3 zijn gelijk? " + gelijk);
        }

        {
            final String s1 = new String("Een instance van een class");
            final String s2 = new String("Een instance van een class");
            final String s3 = s1;
            //Voor objecten test == of dit hetzelfde object is
            boolean zelfdeObject = s1 == s2;
            System.out.println("s1 en s2 zijn hetzelfde? " + zelfdeObject);
            zelfdeObject = s1 == s3;
            System.out.println("s1 en s3 zijn hetzelfde? " + zelfdeObject);
            //Voor objecten gebruik je equals om te testen of 2 verschillende objecten gelijk zijn
            boolean gelijkWaardig = s1.equals(s2);
            System.out.println("s1 en s2 zijn gelijkwaardig? " + gelijkWaardig);
            gelijkWaardig =  s1.equals(s3);
            System.out.println("s1 en s3 zijn gelijkwaardig? " + gelijkWaardig);
        }

    }
}
