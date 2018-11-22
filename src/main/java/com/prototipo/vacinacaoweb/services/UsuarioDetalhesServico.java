package com.prototipo.vacinacaoweb.services;

        import com.prototipo.vacinacaoweb.models.Usuario;
        import com.prototipo.vacinacaoweb.repositories.UsuarioRepository;
        import org.springframework.beans.factory.annotation.Autowired;
        import org.springframework.security.core.authority.SimpleGrantedAuthority;
        import org.springframework.security.core.userdetails.User;
        import org.springframework.security.core.userdetails.UserDetails;
        import org.springframework.security.core.userdetails.UserDetailsService;
        import org.springframework.security.core.userdetails.UsernameNotFoundException;
        import org.springframework.stereotype.Component;


        import java.util.ArrayList;
        import java.util.List;

@Component
public class UsuarioDetalhesServico implements UserDetailsService {
    @Autowired
    private UsuarioRepository repositorio;

    @Override
    public UserDetails loadUserByUsername(String nomeUsuario) throws UsernameNotFoundException {

        Usuario usuario = repositorio.findByUsuario(nomeUsuario);

        if (usuario == null ) {
            throw new UsernameNotFoundException("Usuário não encontrado");
        }

        List<SimpleGrantedAuthority> autorizacoes = new ArrayList<SimpleGrantedAuthority>();
        autorizacoes.add(new SimpleGrantedAuthority("user"));

        return new User(usuario.getUsuario(), usuario.getSenha(), autorizacoes);
    }
}
