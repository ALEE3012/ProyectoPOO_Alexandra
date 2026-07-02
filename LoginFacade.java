package com.abarrotes.facade;

import Modelo.UsuarioDAO;
import com.abarrotes.model.Usuario;

public class LoginFacade {

    private UsuarioDAO dao = new UsuarioDAO();

    public Usuario iniciarSesion(String usuario, String clave) {
        return dao.validar(usuario, clave);
    }
}