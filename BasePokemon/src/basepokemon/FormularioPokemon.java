/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basepokemon;

//import static basepokemon.ContenedorPokemon.lp;
import java.awt.Dimension;
import java.awt.FileDialog;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import static java.lang.Math.round;
import java.text.DecimalFormat;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;


/**
 *
 * @author Zelph
 */
public class FormularioPokemon extends javax.swing.JFrame{

    /**
     * Creates new form FormularioPokemon
     */
    Comunica miInterfazRemota;
    String ruta;

    
      
    
    
    //Crea el fondo para el panel
    public class Imagen extends javax.swing.JPanel{
    
        public Imagen(){
            this.setSize(691,436);
      
        }
        
        public void paint (Graphics grafico){
            Dimension height = getSize();
            ImageIcon img = new ImageIcon(getClass().getResource("/Imagenes/fondopokemon.jpg"));
            grafico.drawImage(img.getImage(), 0, 0, height.width, height.height, null);
            setOpaque(false);
            super.paintComponent(grafico);
        }
    
    }
        
    
   
    
    public FormularioPokemon(Comunica comunicacion) {
       
        
        initComponents();
        miInterfazRemota = comunicacion;
        
        setTitle("Pokedex");
        setLocationRelativeTo(null);
        setResizable(false);
        jTextField2.setVisible(false);
        
        
        //Pone el fondo en el panel
        Imagen Imagen = new Imagen();
        jPanel1.add(Imagen);
        jPanel1.repaint();
        
        jComboBox1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jTextField2.setText(jComboBox1.getSelectedItem().toString()); //To change body of generated methods, choose Tools | Templates.
            }
        });
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField3 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        botonTabla = new javax.swing.JButton();
        guardarBoton = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jSpinner1 = new javax.swing.JSpinner();
        jLabel7 = new javax.swing.JLabel();
        jSpinner2 = new javax.swing.JSpinner();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();

        jTextField3.setText("jTextField3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Nombre");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Tipo");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Peso");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Vida");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Puntos de Combate");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Apodo/Alias");

        botonTabla.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/openpokeball.png"))); // NOI18N
        botonTabla.setBorder(null);
        botonTabla.setContentAreaFilled(false);
        botonTabla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                botonTablaMouseEntered(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                botonTablaMousePressed(evt);
            }
        });
        botonTabla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonTablaActionPerformed(evt);
            }
        });

        guardarBoton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/pokebola.png"))); // NOI18N
        guardarBoton.setToolTipText("");
        guardarBoton.setBorder(null);
        guardarBoton.setContentAreaFilled(false);
        guardarBoton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                guardarBotonMouseEntered(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                guardarBotonMousePressed(evt);
            }
        });
        guardarBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarBotonActionPerformed(evt);
            }
        });

        jTextField1.setBackground(new java.awt.Color(255, 255, 255));
        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField1KeyTyped(evt);
            }
        });

        jTextField2.setBackground(new java.awt.Color(255, 255, 255));
        jTextField2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField2KeyTyped(evt);
            }
        });

        jTextField4.setBackground(new java.awt.Color(255, 255, 255));
        jTextField4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField4KeyTyped(evt);
            }
        });

        jTextField5.setBackground(new java.awt.Color(255, 255, 255));
        jTextField5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField5KeyTyped(evt);
            }
        });

        jTextField6.setBackground(new java.awt.Color(255, 255, 255));

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/camarapokemon.png"))); // NOI18N
        jButton3.setBorder(null);
        jButton3.setBorderPainted(false);
        jButton3.setContentAreaFilled(false);
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton3MouseEntered(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton3MousePressed(evt);
            }
        });
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jSpinner1.setModel(new javax.swing.SpinnerNumberModel(0.0f, 0.0f, null, 0.1f));
        jSpinner1.setBorder(null);
        jSpinner1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jSpinner1KeyTyped(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Altura");

        jSpinner2.setModel(new javax.swing.SpinnerNumberModel(0.0f, 0.0f, null, 0.1f));
        jSpinner2.setBorder(null);

        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Imagennodisponible.png"))); // NOI18N
        jLabel8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Ingresa los datos del Pokemón");

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("mts.");

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Kg");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Elige el tipo del pokemon", "Acero", "Agua", "Bicho", "Dragón", "Eléctrico", "Fantasma", "Fuego", "Hada", "Hielo", "Lucha", "Normal", "Planta", "Psiquico", "Roca", "Siniestro", "Tierra", "Veneno", "Volador" }));
        jComboBox1.setSelectedIndex(0);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel8)
                        .addGap(31, 31, 31)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel2))
                            .addComponent(jLabel6)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel3)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                        .addComponent(jLabel1)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSpinner2, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel10))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jTextField6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 181, Short.MAX_VALUE)
                        .addComponent(jTextField5, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jTextField4, javax.swing.GroupLayout.Alignment.LEADING))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTextField1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 185, Short.MAX_VALUE)))
                .addGap(37, 37, 37))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(117, 117, 117)
                .addComponent(jButton3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(botonTabla)
                .addGap(90, 90, 90)
                .addComponent(guardarBoton)
                .addGap(88, 88, 88))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jLabel9)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)
                            .addComponent(jSpinner2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10)
                            .addComponent(jLabel11))
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(24, 24, 24)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(botonTabla)
                            .addComponent(guardarBoton)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jButton3)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonTablaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonTablaActionPerformed
       this.dispose();
    }//GEN-LAST:event_botonTablaActionPerformed

    private void guardarBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarBotonActionPerformed
        //Validación de campos
        String texto, texto1,texto4, texto5;
    
        
        
        texto=this.jTextField1.getText();
        texto1=this.jTextField2.getText();
        Float texto2= (Float)jSpinner1.getValue();
        Float texto3= (Float)jSpinner2.getValue();
        texto4=this.jTextField4.getText();
        texto5=this.jTextField5.getText();
        
        if (texto.isEmpty()){
       JOptionPane.showMessageDialog(null,"Necesita ingresar un nombre para el pokemón","Validacion",JOptionPane.ERROR_MESSAGE);
       }
        else{if (texto1.equals("Elige el tipo del pokemon")||texto1.isEmpty()){
       JOptionPane.showMessageDialog(null,"Necesita ingresar un tipo para el pokemón","Validacion",JOptionPane.ERROR_MESSAGE);
       }
        else {if (texto2==0){
       JOptionPane.showMessageDialog(null,"Necesita ingresar un peso para el pokemón","Validacion",JOptionPane.ERROR_MESSAGE);
       }
        else {if (texto2<0){
       JOptionPane.showMessageDialog(null,"Necesita ingresar un peso positivo para el pokemón","Validacion",JOptionPane.ERROR_MESSAGE);
       }
        else {if (texto3==0){
       JOptionPane.showMessageDialog(null,"Necesita ingresar una altura para el pokemón","Validacion",JOptionPane.ERROR_MESSAGE);
       }
        else {if (texto3<0){
       JOptionPane.showMessageDialog(null,"Necesita ingresar una altura positiva para el pokemón","Validacion",JOptionPane.ERROR_MESSAGE);
       }
        else {if (texto4.isEmpty()){
       JOptionPane.showMessageDialog(null,"Necesita ingresar la vida del pokemón","Validacion",JOptionPane.ERROR_MESSAGE);
       }
        else {if (texto5.isEmpty()){
       JOptionPane.showMessageDialog(null,"Necesita ingresar los puntos de combate para el pokemón","Validacion",JOptionPane.ERROR_MESSAGE);
       }
        
        else{
        //instancia de un pokemon
        Pokemon p = new Pokemon();
         
         //Obtiene los datos para formar el pokemon
         String nombre=jTextField1.getText();
         String tipo=jTextField2.getText();
         float peso= (Float)jSpinner1.getValue();
         float altura=(Float)jSpinner2.getValue();
         int vida=Integer.parseInt(jTextField4.getText());
         int puntosCombate=Integer.parseInt(jTextField5.getText());
         String alias=jTextField6.getText();
         
        
        //Contruye el pokemon
         p.setNombre(nombre);
         p.setTipo(tipo);
         p.setPeso(peso);
         p.setAltura(altura);
         p.setVida(vida);
         p.setPuntosCombate(puntosCombate);
         p.setAlias(alias);
         p.setRuta(ruta);
         
         //Pone el pokemon en el arreglo
        //lp.add(p);
        miInterfazRemota.agregaPokemon(p);
        //Notifica que se ha guardado el pokemon
        JOptionPane.showMessageDialog(null,"Pokemon Registrado");
        
        
        
        
        //Regresa a la ventana anterior y cierra la actual
        //new DatosPokemon().setVisible(true);
         this.dispose();
        }
       }
      }
     }
    }
    }
    }
   }
    
    }//GEN-LAST:event_guardarBotonActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        //File dialog - abre la ventana de carga de archivo para la foto
         FileDialog diag;
        diag =new FileDialog(this, "Cargar Pokemon");
        diag.setLocationRelativeTo(null);
        diag.setVisible(true);
        
        //Coloca la imagen en el Label
        String archivo =diag.getFile();
        String directorio =diag.getDirectory();
        ruta = directorio+archivo;
        Icon icon =new ImageIcon(directorio+archivo);
       jLabel8.setIcon(icon);
       
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jTextField4KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField4KeyTyped
        char c=evt.getKeyChar();
        if((c<'0'||c>'9')&&(c!=(char)KeyEvent.VK_BACK_SPACE)){
            evt.consume();
            JOptionPane.showMessageDialog(null, "Sólo se permiten números", "Validar número", JOptionPane.INFORMATION_MESSAGE);
        }
        String Caracteres = jTextField4.getText();
        if(Caracteres.length()>=3){
            evt.consume();
            
             getToolkit().beep();
        }
    }//GEN-LAST:event_jTextField4KeyTyped

    private void jTextField5KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField5KeyTyped
        char c=evt.getKeyChar();
        if((c<'0'||c>'9')&&(c!=(char)KeyEvent.VK_BACK_SPACE)){
            evt.consume();
            JOptionPane.showMessageDialog(null, "Sólo se permiten números", "Validar número", JOptionPane.INFORMATION_MESSAGE);
        }
        String Caracteres = jTextField5.getText();
        if(Caracteres.length()>=3){
            evt.consume();
            
             getToolkit().beep();
        }
    }//GEN-LAST:event_jTextField5KeyTyped

    private void jTextField2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField2KeyTyped
      
    }//GEN-LAST:event_jTextField2KeyTyped

    private void jSpinner1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jSpinner1KeyTyped
          char c=evt.getKeyChar();
        if((c<'0'||c>'9')&&c !='.'&&(c!=(char)KeyEvent.VK_BACK_SPACE)){
            evt.consume();
            JOptionPane.showMessageDialog(null, "Sólo se permiten números", "Validar número", JOptionPane.INFORMATION_MESSAGE);
        }
       
    }//GEN-LAST:event_jSpinner1KeyTyped

    private void jTextField1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyTyped
         char c=evt.getKeyChar();
        if((c<'a' || c>'z')&& (c<'A' || c>'Z') &&c !='ñ'&&c!='Ñ'&&c !='á'&&c !='é'&&c !='í'&&c !='ó'&&c !='ú'&&c !='Á' &&c !='É'&&c !='Í'&&c !='Ó'&&c !='Ú'&&(c!=(char)KeyEvent.VK_BACK_SPACE)&&(c!=(char)KeyEvent.VK_SPACE)){
            evt.consume();
            JOptionPane.showMessageDialog(null, "Sólo se permiten letras (a-z) (A-Z)", "Validar texto", JOptionPane.INFORMATION_MESSAGE);
        
        }
        String Caracteres = jTextField1.getText();
        if(Caracteres.length()>=70){
            evt.consume();
            
             getToolkit().beep();
        }
    }//GEN-LAST:event_jTextField1KeyTyped

    private void guardarBotonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_guardarBotonMouseEntered
        
        guardarBoton.setRolloverIcon (new ImageIcon("pokebolanegra.png"));
          
    }//GEN-LAST:event_guardarBotonMouseEntered

    private void botonTablaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonTablaMouseEntered
        botonTabla.setRolloverIcon(new ImageIcon("openpokeballnegra.png"));
    }//GEN-LAST:event_botonTablaMouseEntered

    private void jButton3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseEntered
        jButton3.setRolloverIcon(new ImageIcon("camarapokemonblack.png"));
    }//GEN-LAST:event_jButton3MouseEntered

    private void guardarBotonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_guardarBotonMousePressed
       guardarBoton.setRolloverIcon (new ImageIcon("pokebola.png"));
    }//GEN-LAST:event_guardarBotonMousePressed

    private void botonTablaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonTablaMousePressed
        botonTabla.setRolloverIcon(new ImageIcon("openpokeball.png"));
    }//GEN-LAST:event_botonTablaMousePressed

    private void jButton3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MousePressed
        jButton3.setRolloverIcon(new ImageIcon("camarapokemon.png"));
    }//GEN-LAST:event_jButton3MousePressed

   
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonTabla;
    private javax.swing.JButton guardarBoton;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JSpinner jSpinner2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    // End of variables declaration//GEN-END:variables
}
