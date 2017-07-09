package ifpb.ads.jsf;

/**
 * @author Ricardo Job
 * @mail ricardo.job@ifpb.edu.br
 * @since 08/06/2017, 07:16:59
 */
public class Pessoas { 

//    private Connection connection;
//    private String url = "jdbc:postgresql://0.0.0.0:5433/dac-exemplo";
//    private String senha = "12345";
//    private String usuario = "postgres";
//
//    public Pessoas() {
//        initConnection();
//    }
//
//    private void initConnection() {
//        try {
//            connection = DriverManager.getConnection(url, usuario, senha);
//        } catch (SQLException ex) {
//            Logger.getLogger(Pessoas.class.getName()).log(Level.SEVERE, null, ex);
//        }
//    }
//
//    public boolean salvar(Pessoa pessoa) {
//        try {
//            String sql = "INSERT INTO pessoa(nome) VALUES(?);";
//            PreparedStatement statement = connection.prepareStatement(sql);
//            statement.setString(1, pessoa.getNome());
//            return statement.executeUpdate() > 0;
//        } catch (SQLException ex) {
//            Logger.getLogger(Pessoas.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        return false;
//    }
//
//    public List<Pessoa> todas() {
//
//        try {
//            String sql = "SELECT * FROM pessoa;";
//            PreparedStatement statement = connection.prepareStatement(sql);
//            return percorrer(statement.executeQuery());
//        } catch (SQLException ex) {
//            Logger.getLogger(Pessoas.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        return Collections.emptyList();
//    }
//
//    private List<Pessoa> percorrer(ResultSet result) {
//        List<Pessoa> pessoas = new ArrayList<>();
//        try {
//            while (result.next()) {
//                pessoas.add(
//                        new Pessoa(result.getInt("id"),
//                                result.getString("nome")));
//            }
//        } catch (SQLException ex) {
//            Logger.getLogger(Pessoas.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        return pessoas;
//    }

}