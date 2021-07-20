
package Logica;

import Persistencia.ControladoraJPA;
import java.util.List;


public class Controladora {
    
    ControladoraJPA control = new ControladoraJPA();
    
    //empleado
    public void CrearEmpleado(Empleado emp){
        
        control.CrearEmpleado(emp);
    }
    
    public void EditarEmpleado(Empleado emp){
        
        control.EditarEmpleado(emp);
    }
    
    public void BorrarEmpleado(int Id){
        
        control.BorrarEmpleado(Id);
    }
    
    public Empleado TraerEmpleado(int Id){
        
        Empleado e = control.TraerEmpleado(Id);
        return e;
    }
    
    public List <Empleado> ListaEmpleados(){
        
        List <Empleado> e = control.ListaEmpleados();
        return e;
    }
    //----------------------------------------
    
    //usuario
    public void CrearUsuario(Usuario user){
        
        control.CrearUsuario(user);
    }
    
    public void EditarUsuario(Usuario user){
        
        control.EditarUsuario(user);
    }
    
    public void BorrarUsuario(int Id){
        
        control.BorrarUsuario(Id);
    }
    
    public Usuario TraerUsuario(int Id){
        
        Usuario us = control.TraerUsuario(Id);
        return us;
    }
    public List<Usuario> ListarUsuarios(){
        
        List <Usuario> li = control.ListaUsuarios();
        return li;
    }
    //--------------------------------------------
    
    //juegos
    
    public void CrearJuego(Juego Game){
        
        control.CrearJuego(Game);
    }
    
    public void BorrarJuego(int Id){
        
        control.BorrarJuego(Id);
    }
    
    public void EditarJuego(Juego game){
        
        control.EditarJuego(game);
    }
    
    public Juego TraerJuego(int Id){
        
        Juego ju = control.TraerJuego(Id);
        return ju;
    }
    
    public List<Juego> ListaJuegos(){
        
        List<Juego> ju = control.ListaJuegos();
        return ju;
    }
    //---------------------------------------------
    
    //entrada
    public void CrearEntrada(Entrada entrada){
        
        control.CrearEntrada(entrada);
    }
    
    public void BorrarEntrada(int Id){
        
        control.BorrarEntrada(Id);
    }
    
    public void EditarEntrada(Entrada ent){
        
        control.EditarEntrada(ent);
    }
    
    public Entrada TraerEntrada(int Id){
        
        Entrada en = control.TraerEntrada(Id);
        return en;
    }
    
    public List<Entrada> ListaEntrada(){
        
        List<Entrada> en = control.ListarEntrada();
        return en;
    }
    
    //---------------------------------------------
    //clinte
    
    public void CrearCliente(Cliente cli){
        
        control.CrearCliente(cli);
        
    }
    
    public void BorrarCliente(int id){
        control.BorrarCliente(id);
    }
    
    public void EditarCliente(Cliente cli){
        
        control.EditarCliente(cli);
    }
    
    public Cliente BuscarCliente(int id){
        
        Cliente cli = control.BuscarCliente(id);
        return cli;
    }
    
    public List<Cliente>ListaCliente(){
        List<Cliente>cli = control.ListaCLientes();
        return cli;
    }

    public Cliente TraerCliente(int id_ecliente) {
        Cliente cli = control.BuscarCliente(id_ecliente);
        return cli;
        
    }
}
