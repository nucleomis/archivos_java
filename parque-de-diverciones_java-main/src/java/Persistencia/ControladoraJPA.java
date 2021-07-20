package Persistencia;

import Logica.Cliente;
import Logica.Empleado;
import Logica.Entrada;
import Logica.Juego;
import Logica.Usuario;
import Persistencia.exceptions.NonexistentEntityException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;


public class ControladoraJPA {
    
//empleado
    EmpleadoJpaController emp = new EmpleadoJpaController();
    
    public void CrearEmpleado(Empleado empleado){
        emp.create(empleado);
    }
    
    public void BorrarEmpleado (int ID){
        
        try {
            emp.destroy(ID);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraJPA.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void EncontrarEmpleado(int id){
        emp.findEmpleado(id);
    }
    public void EditarEmpleado(Empleado em){
        
        try {
            emp.edit(em);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraJPA.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public Empleado TraerEmpleado(int ID){
        
        Empleado em = emp.findEmpleado(ID);
        return em;
    }
    
    public List<Empleado> ListaEmpleados(){
        
        List <Empleado> em = emp.findEmpleadoEntities();
        
        return em; 
    }
    
    
//usuario
    UsuarioJpaController user = new UsuarioJpaController();
    
    public void CrearUsuario (Usuario us){
        
        user.create(us);
    }   
    
    public void BorrarUsuario(int Id){
        
        try {
            user.destroy(Id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraJPA.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void EditarUsuario(Usuario us){
        
        try {
            user.edit(us);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraJPA.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public Usuario TraerUsuario(int Id){
        
        Usuario us = user.findUsuario(Id);
        
        return us;
    }
        public List<Usuario> ListaUsuarios() {
        
        List <Usuario> li = user.findUsuarioEntities();
        return li;    
    }
//entrada
    EntradaJpaController ent = new EntradaJpaController();
    
    public void CrearEntrada(Entrada en){
        
        ent.create(en);
    }
    
    public void BorrarEntrada(int Id){
        try {
            ent.destroy(Id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraJPA.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public void EditarEntrada(Entrada en){
        
        try {
            ent.edit(en);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraJPA.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public Entrada TraerEntrada (int Id){
        
        Entrada en = ent.findEntrada(Id);
        return en;
    }
    
    public List <Entrada> ListarEntrada(){
        
        List <Entrada> en = ent.findEntradaEntities();
        return en;
    }
    
//juego
    JuegoJpaController juego = new JuegoJpaController();
    
    public void CrearJuego(Juego game){
        
        juego.create(game);
    }
    
    public void BorrarJuego(int Id){
        
        try {
            juego.destroy(Id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraJPA.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void EditarJuego(Juego game){
        
        try {
            juego.edit(game);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraJPA.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public Juego TraerJuego(int Id){
        
        Juego ju = juego.findJuego(Id);
        return ju;
    }
    
    public List<Juego> ListaJuegos(){
        
        List <Juego> ju = juego.findJuegoEntities();
        return ju; 
    }


  //cliente
    ClienteJpaController client = new ClienteJpaController();
    
    public void CrearCliente(Cliente cli){
        
        client.create(cli);
        
    }
    
    public void BorrarCliente (int id){
        
        try {
            client.destroy(id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraJPA.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void EditarCliente(Cliente cli){
        
        try {
            client.edit(cli);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraJPA.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public Cliente BuscarCliente(int id){
        
        Cliente cli = client.findCliente(id);
        return cli;
    }
    
    public List<Cliente> ListaCLientes(){
        
        List <Cliente> lista = client.findClienteEntities();
        return lista;
    }
}
