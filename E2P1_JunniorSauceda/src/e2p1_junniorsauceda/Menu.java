/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package e2p1_junniorsauceda;

import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Junnior Sauceda
 */
public class Menu extends javax.swing.JFrame {
    ArrayList <Numero> Numeros=new ArrayList<>();
    Scanner sc=new Scanner(System.in);
    Numero N=new Numero();
    
    
    /**
     * Creates new form Menu
     */
    public Menu() {
        initComponents();
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        JB_Numeros = new javax.swing.JButton();
        JB_Operaciones = new javax.swing.JButton();
        JB_Salir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 51, 255));

        jLabel1.setFont(new java.awt.Font("Century", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Examen ll");

        JB_Numeros.setText("Numeros");
        JB_Numeros.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JB_NumerosMouseClicked(evt);
            }
        });

        JB_Operaciones.setText("Operaciones");
        JB_Operaciones.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JB_OperacionesMouseClicked(evt);
            }
        });

        JB_Salir.setText("Salir");
        JB_Salir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JB_SalirMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(153, 153, 153)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(JB_Numeros, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(JB_Operaciones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(JB_Salir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(151, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1)
                .addGap(49, 49, 49)
                .addComponent(JB_Numeros)
                .addGap(18, 18, 18)
                .addComponent(JB_Operaciones)
                .addGap(18, 18, 18)
                .addComponent(JB_Salir)
                .addContainerGap(105, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JB_NumerosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JB_NumerosMouseClicked
        // TODO add your handling code here:
        boolean seguir=true;
        do{
            
            int opcion=Integer.parseInt(JOptionPane.showInputDialog(""
                                        + "Menu Numeros\n\n"
                                        + "1.-Agregar Numero\n"
                                        + "2.-Eliminar Numero\n"
                                        + "3.-Salir\n"
                                        + "Ingrese una opcion: "));
            while(opcion<0||opcion>3){
                opcion=Integer.parseInt(JOptionPane.showInputDialog("La opcion ingresada no es valida ingrese otra opcion"
                                        + "Menu Numeros\n\n"
                                        + "1.-Agregar Numero\n"
                                        + "2.-Eliminar Numero\n"
                                        + "3.-Salir\n"
                                        + "Ingrese una opcion: "));
                
                
            }
            switch(opcion){
                case 1:{
                    int num=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero: "));
                    while(num<1){
                        num=Integer.parseInt(JOptionPane.showInputDialog("El numero debe ser mayor o igual a 1: "));
                    }
                    int base=Integer.parseInt(JOptionPane.showInputDialog("Ingrese la Base que desea: "));
                    while(base<2||base>35){
                        base=Integer.parseInt(JOptionPane.showInputDialog("Base invalida\nIngrese otra base: "));
                    }
                    N=new Numero(num,base);
                    JOptionPane.showMessageDialog(null, "El resultado es: \n"+N.getNumero());
                    Numeros.add(N);
                }
                break;
                case 2:{
                    if(Numeros.size()>0){
                        EliminarNum();
                    }
                    else{
                        JOptionPane.showMessageDialog(null,"Primero debe ingresar un numero");
                    }
                }
                break;
                case 3:{
                    seguir=false;
                }
                break;
            }   
            
        }while(seguir);
    }//GEN-LAST:event_JB_NumerosMouseClicked

    private void JB_OperacionesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JB_OperacionesMouseClicked
        // TODO add your handling code here:
        if(Numeros.size()>1){
            boolean continuar=true;
            while(continuar){
                int operacion=Integer.parseInt(JOptionPane.showInputDialog("Menu Operaciones\n\n\n"
                                                                             + "1.- Sumar Numeros\n"
                                                                             + "2.- Restar Numeros\n"
                                                                             + "3.- Multiplicar Numeros\n"
                                                                             + "4.- Menu Principal\n\n"
                                                                             + "Ingrese una opcion"));
                while(operacion<1||operacion>4){
                    operacion=Integer.parseInt(JOptionPane.showInputDialog("Opcion Invalida, ingrese una opcion valida"
                                                                             + "Menu Operaciones\n\n\n"
                                                                             + "1.- Sumar Numeros\n"
                                                                             + "2.- Restar Numeros\n"
                                                                             + "3.- Multiplicar Numeros\n"
                                                                             + "4.- Menu Principal\n\n"
                                                                             + "Ingrese una opcion"));
                }

                switch(operacion){
                    case 1:{
                       int op1=Integer.parseInt(JOptionPane.showInputDialog("Lista de numeros: \n"
                                                                              + Imprimir()+"\n"
                                                                              + "Ingrese el indice del primer numero: "));
                       while(op1<0||op1>Numeros.size()){
                            op1=Integer.parseInt(JOptionPane.showInputDialog("Ingrese un indice valido"
                                                                              + "Lista de numeros: \n"
                                                                              + Imprimir()+"\n"
                                                                              + "Ingrese el indice del primer numero: "));
                       
                        }
                       int op2=Integer.parseInt(JOptionPane.showInputDialog("Lista de numeros: \n"
                                                                              + Imprimir()+"\n"
                                                                              + "Ingrese el indice del segundo numero: "));
                       while(op2<0||op2>Numeros.size()){
                            op2=Integer.parseInt(JOptionPane.showInputDialog("Ingrese un indice valido"
                                                                              + "Lista de numeros: \n"
                                                                              + Imprimir()+"\n"
                                                                              + "Ingrese el indice del segundo numero: "));
                       
                        }
                       int Basedef;
                       int n=((Numeros.get(op1-1).getOrigen())+(Numeros.get(op2-1).getOrigen()));
                       if((Numeros.get(op1-1).getBase())>(Numeros.get(op2-1).getBase())){
                           Basedef=Numeros.get(op1-1).getBase();
                       }
                       else{
                           Basedef=Numeros.get(op2-1).getBase();
                       }
                       N=new Numero(n,Basedef);
                       JOptionPane.showMessageDialog(null, "El resultado es: \n"+
                               N.getNumero()+"  Base "+N.getBase()+"= "+N.getOrigen()+"\n");
                       
                    }
                    break;
                    case 2:{
                        int op1=Integer.parseInt(JOptionPane.showInputDialog("Lista de numeros: \n"
                                                                              + Imprimir()+"\n"
                                                                              + "Ingrese el indice del primer numero: "));
                       while(op1<0||op1>Numeros.size()){
                            op1=Integer.parseInt(JOptionPane.showInputDialog("Ingrese un indice valido"
                                                                              + "Lista de numeros: \n"
                                                                              + Imprimir()+"\n"
                                                                              + "Ingrese el indice del primer numero: "));
                       
                        }
                       int op2=Integer.parseInt(JOptionPane.showInputDialog("Lista de numeros: \n"
                                                                              + Imprimir()+"\n"
                                                                              + "Ingrese el indice del segundo numero: "));
                       while(op2<0||op2>Numeros.size()){
                            op2=Integer.parseInt(JOptionPane.showInputDialog("Ingrese un indice valido"
                                                                              + "Lista de numeros: \n"
                                                                              + Imprimir()+"\n"
                                                                              + "Ingrese el indice del segundo numero: "));
                       
                        }
                       int Basedef;
                       int n=((Numeros.get(op1-1).getOrigen())-(Numeros.get(op2-1).getOrigen()));
                       if(n>1){
                       
                        if((Numeros.get(op1-1).getBase())>(Numeros.get(op2-1).getBase())){
                            Basedef=Numeros.get(op1-1).getBase();
                        }
                        else{
                            Basedef=Numeros.get(op2-1).getBase();
                        }
                        N=new Numero(n,Basedef);
                        JOptionPane.showMessageDialog(null, "El resultado es: \n"+
                               N.getNumero()+"  Base "+N.getBase()+"= "+N.getOrigen()+"\n");
                       }
                       else{
                           JOptionPane.showMessageDialog(null, "El numero no puede ser negativo");
                       }
                    }
                    break;
                    case 3:{
                        int op1=Integer.parseInt(JOptionPane.showInputDialog("Lista de numeros: \n"
                                                                              + Imprimir()+"\n"
                                                                              + "Ingrese el indice del primer numero: "));
                       while(op1<0||op1>Numeros.size()){
                            op1=Integer.parseInt(JOptionPane.showInputDialog("Ingrese un indice valido"
                                                                              + "Lista de numeros: \n"
                                                                              + Imprimir()+"\n"
                                                                              + "Ingrese el indice del primer numero: "));
                       
                        }
                       int op2=Integer.parseInt(JOptionPane.showInputDialog("Lista de numeros: \n"
                                                                              + Imprimir()+"\n"
                                                                              + "Ingrese el indice del segundo numero: "));
                       while(op2<0||op2>Numeros.size()){
                            op2=Integer.parseInt(JOptionPane.showInputDialog("Ingrese un indice valido"
                                                                              + "Lista de numeros: \n"
                                                                              + Imprimir()+"\n"
                                                                              + "Ingrese el indice del segundo numero: "));
                       
                        }
                       int Basedef;
                       int n=((Numeros.get(op1-1).getOrigen())*(Numeros.get(op2-1).getOrigen()));
                       if((Numeros.get(op1-1).getBase())>(Numeros.get(op2-1).getBase())){
                           Basedef=Numeros.get(op1-1).getBase();
                       }
                       else{
                           Basedef=Numeros.get(op2-1).getBase();
                       }
                       N=new Numero(n,Basedef);
                       JOptionPane.showMessageDialog(null, "El resultado es: \n"+
                               N.getNumero()+"  Base "+N.getBase()+"= "+N.getOrigen()+"\n");
                       
                    }
                    break;
                    case 4:{
                        continuar=false;
                    }
                    break;

                }
            }
        }
        else{
            JOptionPane.showMessageDialog(null,"Primero debe ingresar al menos 2 numeros");
        }
        
    }//GEN-LAST:event_JB_OperacionesMouseClicked

    private void JB_SalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JB_SalirMouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_JB_SalirMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }
    public void EliminarNum(){
//        String Lista="";
//        for(int i=0;i<Numeros.size();i++){
//            Lista+=(i+1)+".- "+Numeros.get(i).getNumero()+"  Base "+Numeros.get(i).getBase()+"= "+Numeros.get(i).getOrigen()+"\n";
//        }
        int Valisteverga=Integer.parseInt(JOptionPane.showInputDialog("Lista de numeros:\n"
                                            +Imprimir()+"\n\n\n"
                                            + "Ingrese el indice del numero que desea eliminar: "));
        while(Valisteverga<0||Valisteverga>Numeros.size()){
            Valisteverga=Integer.parseInt(JOptionPane.showInputDialog("La opcion ingresada no es valida ingrese otra opcion\n"
                                            + "Lista de numeros:\n"
                                            +Imprimir()+"\n\n\n"
                                            + "Ingrese el indice del numero que desea eliminar: "));
        }
        Numeros.remove((Valisteverga-1));
        JOptionPane.showMessageDialog(null,"El numero deseado se ha eliminado correctamente");
        
    }
    public String Imprimir(){
        String Lista="";
        for(int i=0;i<Numeros.size();i++){
            Lista+=(i+1)+".- "+Numeros.get(i).getNumero()+"  Base "+Numeros.get(i).getBase()+"= "+Numeros.get(i).getOrigen()+"\n";
        }
        return Lista;
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JB_Numeros;
    private javax.swing.JButton JB_Operaciones;
    private javax.swing.JButton JB_Salir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
