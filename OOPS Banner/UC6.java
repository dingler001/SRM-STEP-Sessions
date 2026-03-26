public class UC6 {
        public static String[] getOpattern() {
            return new String[] {
                "   ***   ",
                " **   ** ",
                "**     **",
                "**     **",
                "**     **",
                "**     **",
                "**     **",
                " **   ** ",
                "   ***   ",
            };
        }
    public static String[] getPpattern() {
            return new String[] {
                "******  ",
                "**   ** ",
                "**    **",
                "**   ** ",
                "******  ",
                "**      ",
                "**      ",
                "**      ",
                "**      ",
            };
        }

        public static String[] getSpattern() {
            return new String[] {
                "  *****",
                " **    ",
                "**     ",
                " **    ",
                "  ***  ",
                "    ** ",
                "     **",
                "    ** ",
                "*****  ",
            };
        }

        public static void main(String[] args) {
            String[] Opattern = getOpattern();
            String[] Ppattern = getPpattern();
            String[] Spattern = getSpattern();

            for (int i = 0; i < Opattern.length; i++){
                
            System.out.println(Opattern[i] + "  " + Opattern[i] + "  " + Ppattern[i] + "  " + Spattern[i]);
            }

        }


        }
    
