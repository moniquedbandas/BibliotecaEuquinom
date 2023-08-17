package controller;

import DAO.UsuarioDAO;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import model.Usuario;

public class ControllerUsuario {
    private UsuarioDAO usuarioDAO;

    public ControllerUsuario() {
        usuarioDAO = new UsuarioDAO();
    }
    public boolean autenticarUsuario(String nome, String senha) {
        Usuario usuario = new Usuario();
        usuario.setNome(nome);
        usuario.setSenha(senha);

        ResultSet rs = usuarioDAO.autenticacaoUsuario(usuario);

        try {
            if (rs.next()) {
                return true;
            } else {
                return false;
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao autenticar usuário: " + e);
            return false;
        }
    }
}
