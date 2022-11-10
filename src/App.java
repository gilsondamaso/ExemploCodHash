import java.security.MessageDigest;

public class App {
    public static void main(String[] args) throws Exception {
        //-------------- Senha Admin
        String senhaAdmin = "admin";

        MessageDigest algorithm = MessageDigest.getInstance("SHA-256");
        byte messageDigestSenhaAdmin[] = algorithm.digest(senhaAdmin.getBytes("UTF-8"));

        StringBuilder hexStringSenhaAdmin = new StringBuilder();
        for (byte b : messageDigestSenhaAdmin) {
                hexStringSenhaAdmin.append(String.format("%02X", 0xFF & b));
        }
        String senhahexAdmin = hexStringSenhaAdmin.toString();

        System.out.println(senhahexAdmin);
        
        //-------------- Senha User
         
        String senhaUser = "user";

        byte messageDigestSenhaUser[] = algorithm.digest(senhaUser.getBytes("UTF-8"));

        StringBuilder hexStringSenhaUser = new StringBuilder();
        for (byte b : messageDigestSenhaUser) {
                hexStringSenhaUser.append(String.format("%02X", 0xFF & b));
        }
        String senhahexUser = hexStringSenhaUser.toString();

        System.out.println(senhahexUser);
        
        //--Comparando Senha User e Admin

        System.out.println(senhahexUser.equals(senhahexAdmin));//Retorno da Comparação
        
        //-------------- Senha Admin

        String senhaAdminNova = "admin";

        byte messageDigestSenhaAdminNova[] = algorithm.digest(senhaAdminNova.getBytes("UTF-8"));

        StringBuilder hexStringSenhaAdminNova = new StringBuilder();
        for (byte b : messageDigestSenhaAdminNova) {
                hexStringSenhaAdminNova.append(String.format("%02X", 0xFF & b));
        }
        String senhahexAdminNova = hexStringSenhaAdminNova.toString();

        System.out.println(senhahexAdminNova);

        //--Comparando Senha User e Admin

        System.out.println(senhahexAdminNova.equals(senhahexAdmin));//Retorno da Comparção
    }
}
