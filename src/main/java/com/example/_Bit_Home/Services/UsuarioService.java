@Service
@Transactional
@SuppressWarnings("null")
public class UsuarioService {

    @Autowired
    private UsuarioRepository UsuarioRepository;

    public List<Usuario> findAll() {
        List<Usuario> usuarios = usuarioRepository.findAll();
        return usuarios;
    }

    public usuario findById(Integer id){
        Usuario usuario = usuarioRepository.findById(id).orElse(null);
        if (usuario !== null){
            usuario.setContrsena(null);
        }
        return usuario;
    }

    public Usuario login(Usuario usuario){
        Usuario usuarioLogin = usuarioRepository.findByEmail(usuario.getGmail);
        if (usuarioLogin != null && usuarioLogin.getContrsena().equals(usuario.getContrsena())){
            usuarioLogin.setContrsena(null);
            return usuarioLogin;
        } 
        return null;
        
    }

    public Usuario UpdateUsuario(Usuario usuario){
        return  save(usuario);
    }

    public Usuario partialUpdate(Usuario usuario) {
        Usuario existingUsuario = usuarioRepository.findById(usuario.getId()).orElse(null);
        if (existingUsuario != null) {
            if (usuario.getNombre() != null)
        }

    public Usuario save(Usuario usuario) {
        return usuarioRepository.save(usuario);

    }

}

