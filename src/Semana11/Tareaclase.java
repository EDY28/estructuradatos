
package Semana11;

import java.util.ArrayList;
import java.util.Random;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author sumaran
 */

  class Metodo{
        
       int aletorioEntero(int min, int max) {
        Random rd = new Random();
        int r = rd.nextInt((max - min) + 1) + min;
        return r;
    }
    void rellenarV(int v[],int n){
        for (int i = 0; i <v.length ; i++) {
            v[i]=aletorioEntero(1,20);
        }
    }
    int sumarR(int v[], int i){
        if(i==0) return v[i] ;
        else return v[i]+sumarR(v,i-1);
    }
    
    int sumarI(int v[]){
        int suma=0;
        for (int i = 0; i < v.length; i++) {
            suma +=v[i];
        }
        return suma;
    }
    String mostrar(int v[]){ 
        String acu="";
        for(Integer i:v){
         acu+=" + "+i;  
        }
        return acu;
    }
 
}

class Datos {
    String tipo;
    int tamanio;
    long inicio,fin,resultado;
    long suma;

    public Datos(int tamanio, String tipo, long inicio, long fin,long resultado,long suma) {
        this.tamanio = tamanio;
        this.tipo = tipo;
        this.inicio = inicio;
        this.fin = fin;
        this.resultado=resultado ;
        this.suma=suma;
    }

    public int getTamanio() {
        return tamanio;
    }

    public String getTipo() {
        return tipo;
    }

    public long getInicio() {
        return inicio;
    }

    public long getFin() {
        return fin;
    }

    public long getResultado() {
        return resultado;
    }

    public long getSuma() {
        return suma;
    }
    

    }
public class Tareaclase extends javax.swing.JFrame {

     ArrayList<Datos> lista;
    int vec[];
    int n=0;
    Metodo m=new Metodo();
    
    public Tareaclase() {
        lista=new ArrayList<>(); 
        initComponents();
        llenarTabla();
        buttonGroup1.add(result_recursivo);
        buttonGroup1.add(result_iterativo);
         // lista=new ArrayList<>(); 
    }
    
     private void llenarTabla() {
        String cabeza[]={"Tamaño","Tipo","Inicio","Fin","Resultado","Suma"};
        DefaultTableModel modelodef=new DefaultTableModel(cabeza,lista.size());
        tabla_datos.setModel(modelodef);
        
        TableModel modelo=tabla_datos.getModel();
         for (int i = 0; i < lista.size(); i++) {
            Datos d=lista.get(i);
            modelo.setValueAt(d.getTamanio(), i, 0);
            modelo.setValueAt(d.getTipo(),i, 1);
               modelo.setValueAt(d.getInicio(),i, 2);
                  modelo.setValueAt(d.getFin(),i, 3);
                     modelo.setValueAt(d.getResultado(),i, 4);
                     modelo.setValueAt(d.getSuma(),i, 5);
        }
        }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        numero_elementos = new javax.swing.JTextField();
        generar_datos = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        result_recursivo = new javax.swing.JRadioButton();
        result_iterativo = new javax.swing.JRadioButton();
        resultado_suma1 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla_datos = new javax.swing.JTable();
        realizar_op = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        jLabel1.setText("SUMA DE ELEMENTOS DE  UN VECTOR ");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Numero  Elementos");

        generar_datos.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        generar_datos.setText("Generar Datos");
        generar_datos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generar_datosActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Tipo");

        result_recursivo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        result_recursivo.setText("Recursivo");

        result_iterativo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        result_iterativo.setText("Iterativo");

        tabla_datos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Tamaño", "Tipo", "Inicio", "Fin", "Resultado", "Suma"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Integer.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tabla_datos);

        realizar_op.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        realizar_op.setText("Realizar");
        realizar_op.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                realizar_opActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(numero_elementos, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(37, 37, 37)
                                .addComponent(generar_datos))
                            .addComponent(resultado_suma1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 438, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 27, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(result_recursivo, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(result_iterativo, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(realizar_op)))
                    .addComponent(jScrollPane1))
                .addGap(33, 33, 33))
            .addGroup(layout.createSequentialGroup()
                .addGap(93, 93, 93)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(result_recursivo)
                        .addGap(8, 8, 8)
                        .addComponent(result_iterativo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(realizar_op)
                        .addGap(12, 12, 12))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(numero_elementos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(generar_datos))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(resultado_suma1, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void generar_datosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generar_datosActionPerformed
         this.resultado_suma1.setText("");
        int n=Integer.parseInt(this.numero_elementos.getText().trim());
         Metodo m=new Metodo();
      //  int vec []=new int[n];
        this.vec=new int[n];
        this.n=n;
        m.rellenarV(vec,n);
        
         this.resultado_suma1.setText(m.mostrar(vec));
        
        this.numero_elementos.setText("");
        
    }//GEN-LAST:event_generar_datosActionPerformed

    private void realizar_opActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_realizar_opActionPerformed
     long inicio=0;
     long fin=0;
     long resultado= 0;
        if(result_recursivo.isSelected()){
             inicio=System.nanoTime();
            resultado= m.sumarR(vec, n-1);
            fin=System.nanoTime();
             lista.add(new Datos(n,"Recursivo",inicio,fin,fin-inicio,resultado));
         
        }else if(result_iterativo.isSelected()){
              inicio=System.nanoTime();
            resultado= m.sumarI(vec);
            fin=System.nanoTime();
             lista.add(new Datos(n,"Iterativo",inicio,fin,fin-inicio,resultado));
        }else{
                JOptionPane.showMessageDialog(null, "No se selecciono");
                }
         //JOptionPane.showMessageDialog(null, ""+resultado);
        llenarTabla();
    }//GEN-LAST:event_realizar_opActionPerformed

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
            java.util.logging.Logger.getLogger(Tareaclase.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tareaclase.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tareaclase.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tareaclase.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tareaclase().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton generar_datos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField numero_elementos;
    private javax.swing.JButton realizar_op;
    private javax.swing.JRadioButton result_iterativo;
    private javax.swing.JRadioButton result_recursivo;
    private javax.swing.JTextField resultado_suma1;
    private javax.swing.JTable tabla_datos;
    // End of variables declaration//GEN-END:variables
}
