/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Project;
 
import javax.swing.ImageIcon;

/**
 *
 * @author Mes dossiers
 */
public class NiveauJFrame extends javax.swing.JFrame {
    private int xMouse;
    private int yMouse;
                Question qita = new Question (new Pays ("Italie","Rome",true),"Amsterdam","Londres");
		Question qpbs = new Question (new Pays ("Pays-Bas","Amsterdam",true),"Moscou","Lisbonne");
		Question qesp = new Question (new Pays ("Espagne","Madrid",true),"Paris","Barcelone");
		Question qusa = new Question (new Pays ("États-Unis","Washington",true),"New York","Los Angeles");
		Question quk = new Question (new Pays ("Royaume-Uni","Londres",true),"Berlin","Rome");
		Question qru = new Question (new Pays ("Russie","Moscou",false),"Bruxelles","Amsterdam");
		Question qfr = new Question (new Pays ("France","Paris",false),"Madrid","Lisbonne");
		Question qtn = new Question (new Pays ("Tunisie","Tunis",false),"Ribat","Sfax");
		Question qgr = new Question (new Pays ("Grece","Athénes",false),"Paris","Madrid");
		Question qal = new Question (new Pays ("Allemagne","Berlin",true),"Bruxelles","Lisbonne");
		
		
		
		Question qcanada = new Question (new Pays ("Canada","Ottawa",true),"Québec","Bruxelles");
		Question qlu = new Question (new Pays ("Luxembourg","Luxembourg",false),"Banqui","Lomé");
		Question qbelg = new Question (new Pays ("Belgique","Bruxelles",false),"Kiev","Lisbonne");
		Question qchine = new Question (new Pays ("Chine","Pékin",true),"Tokyo","Séoul");
		Question qpor = new Question (new Pays ("Portugal","Lisbonne",true),"Madrid","Amsterdam");
		Question qarge= new Question (new Pays ("Argentine","Buenos Aires",false),"San Luis","Saint John's");
		Question qmex = new Question (new Pays ("Mexique","Mexico",true),"Madrid","San josé");
		Question qjapon = new Question (new Pays ("Japon","Tokyo",true),"Pékin","Séoul");
		Question qmar= new Question (new Pays ("Maroc","Rabat",true),"Casablanca","Marrakech");
		Question qag = new Question (new Pays ("Algerie","Alger",false),"Ankara","Alger");
		
		
		
		Question qpe = new Question (new Pays ("Pérou","Lima",false),"La Paz","Port Moresby");
		Question qafg = new Question (new Pays ("Afghanistan","Kaboul",true),"Kampala","Katmandou");
		Question qbrz = new Question (new Pays ("Brésil","Brasilia",true),"Rio de Janeiro","Porto Alegre");
		Question qtur = new Question (new Pays ("Turquie","Ankara",false),"Istanbul","Izmir");
		Question qqa = new Question (new Pays ("Qatar","Doha",true),"Manama","Abou Dabi");
		Question qegy = new Question (new Pays ("Egypte","Le Caire",false),"Ismaïlia","Sina");
		Question qcds = new Question (new Pays ("Corée du Sud","Séoul",true),"Tokyo","Pékin");
		Question qaustr = new Question (new Pays ("Australie","Canberra",true),"Sydney","Amsterdam");
		Question qur = new Question (new Pays ("Urugay","Montevideo",false),"Porto Alegre","Buenos Aires");
		Question qse = new Question (new Pays ("Sénégal","Dakar",true),"Dacca","Accra");
		Question qda = new Question (new Pays ("Danemark","Copenhague",true),"Zagre","Québec");
		
 
		
		Question qli = new Question ( new Pays ("Liban","Beyrouth",true),"Lima","Khartoum");
		Question qcroatie = new Question (new Pays ("Croatie","Zagreb",false),"Québec","Kiev");
		Question qlib = new Question (new Pays ("Libye","Tripoli",false),"Misrata","Rabat");
		Question qfila= new Question (new Pays ("Finlande","Helsinki",false),"Zagreb","Espoo");
		Question qequa= new Question (new Pays ("Equateur","Quito",false),"Suva","Saint-Domingue");
		Question qja = new Question (new Pays ("Jamaéque","Kingston",true),"Kampala","Kaboul");
	
    	        Question qgh = new Question (new Pays ("Ghana","Accra",true),"Yaoundé","Kiev");
		Question qksa= new Question (new Pays ("Arabie saoudite","Riyad",false),"Maka","Rabat");
		Question qslov = new Question (new Pays ("Slovénie","Ljubljana",true),"Bratislava","FreeTown");
		
		

	        Question qpara = new Question (new Pays ("Paraguay","Asuncion",true),"La Haye","Astana");
		Question qcuba = new Question (new Pays ("Cuba","La Havane",true),"Apia","San josé");
		Question qcolombie = new Question (new Pays ("Colombie","Bogota",false),"Quito","Lomé");
		Question qnigeria = new Question (new Pays ("Nigeria","Abuja",true),"Libreville","Lima");
		Question qcam = new Question (new Pays ("Cameroun","Yaoundé",true),"Yamoussoukro","Luanda");
		Question qukra = new Question (new Pays ("Ukraine","Kiev",false),"Québec","Zagreb");
		Question qidoni = new Question (new Pays ("Indonésie","Jakarta",false),"Jambi","New Delhi");
		Question qgui = new Question (new Pays ("Guinée","Conakry",false),"Yaoundé","Luanda");
		Question qmali = new Question (new Pays ("Mali","Bamako",true),"Malé","Maputo");
		Question qniger = new Question (new Pays ("Niger","Niamey",true),"Yaren","Nouakchott");
		
		
		
		


	        Question qba = new Question (new Pays ("Baherin","Manama",true),"Doha","Rabat");
	        Question qto = new Question (new Pays ("Togo","Lomé",true),"Talinn","Lima");
	        Question qga = new Question (new Pays ("Gambie","Banjul",false),"Port-vila","Bangui");
		Question qci= new Question (new Pays ("Côte d'Ivoire","Yamoussoukro",true),"Yaoundé","Luanda");
		Question qbie = new Question (new Pays ("Biélorussie","Minsk",false),"Belmopan","Canberra");
		Question qsue= new Question (new Pays ("Suède","Stockholm",false),"Berne","Kiev");
		Question qcosta = new Question (new Pays ("Costa Rica","San José",true),"Lima","San Luis");
		Question qnorvege = new Question (new Pays ("Norvège","Oslo",true),"Wellington","Ottawa");
		Question qbosnie  = new Question (new Pays ("Bosnie-Herzégovine","Sarajevo",false),"Sucre","Izmir");
		Question qpakistan = new Question (new Pays ("Pakistan","Islamabad",true),"Abuja","Addis-Abeba");
		
		
		Question qchili = new Question (new Pays ("Chili","Santiago",true),"San Luis","Saint John's");
		Question qmozanbique = new Question (new Pays ("Mozambique","Maputo",true),"Katmandou","Libreville");
		Question qgabon= new Question (new Pays ("Gabon","Libreville",true),"Maputo","Yaoundé");
		Question qpologne = new Question (new Pays ("Pologne","Varsovie",false),"Manille","Lima");
		Question qbulgarie = new Question (new Pays ("Bulgarie","Sofia",false),"Belmopan","Canberra");
		Question qvenezuela  = new Question (new Pays ("Venezuela","Caracas",true),"Jakarta","New Delhi");
		Question qan = new Question (new Pays ("Angola","Luanda",false),"Varsovie","Lomé");
		Question qne= new Question (new Pays ("Népal","Katmandou",true),"Maputo","Luanda");
		Question qka= new Question (new Pays ("Kazakhstan","Astana",true),"Tallinn","Dakar");
		Question qalbanie = new Question (new Pays ("Albanie","Tirana",true),"Andorre-la-Vieille","Sofia");
		
		
		
		
	        Question qcoréedunord= new Question (new Pays ("Corée du Nord","Pyongyang",false),"Seoul","Oslo");
		Question qestonie = new Question (new Pays ("Estonie","Tallinn",true),"Kingstown","La Paz");
		Question qfidji = new Question ( new Pays ("Fidji","Suva",true),"La Havane","Varsovie");
		Question qvietnam = new Question (new Pays ("Viêt Nam","Hanoï",false),"Harare","Sarajevo");
		Question qbotswana= new Question (new Pays ("Botswana","Gaborone",true),"Bamako","Lusaka");
		Question qchypre= new Question (new Pays ("Chypre","Nicosie",true),"Berne","Kiev");
		Question qbangladesh = new Question (new Pays ("Bangladesh","Dacca",true),"Ouagadougou","Dakar");
		Question qburkina= new Question (new Pays ("Burkina Faso","Ouagadougou",true),"Bujumbura","Luanda");
		Question qczambie = new Question (new Pays ("Zambie","Lusaka",true),"Tiraspol","Pristina");
		Question qni = new Question ( new Pays ("Nicaragua","Managua",false),"Ouagadougou","Manille");
		

       Niveau   nv1 = new Niveau ();  
        Niveau   nv2 = new Niveau ();  
           Niveau   nv3 = new Niveau ();  
             Niveau   nv4 = new Niveau ();    
             Niveau   nv5 = new Niveau ();
               Niveau   nv6 = new Niveau ();  
                 Niveau   nv7 = new Niveau ();  
                   Niveau   nv8 = new Niveau ();  
                   
       
        public static Niveau getNv1(){
            return nv;
        }
	private static  Niveau nv;
    /**
     * Creates new form niveauFrame
     */
    public NiveauJFrame() {
              nv1.remplir(qita); 
		nv1.remplir( qpbs);
		nv1.remplir(qesp); 
		nv1.remplir( qusa );
		nv1.remplir( quk );
		nv1.remplir( qru );
		nv1.remplir( qfr );
		nv1.remplir(qtn );
		nv1.remplir( qgr );
		nv1.remplir(qal );
		
		
		
		nv2.remplir( qcanada);
		nv2.remplir( qlu );
		nv2.remplir( qbelg );
		nv2.remplir( qchine );
		nv2.remplir(qpor );
		nv2.remplir(qarge);
		nv2.remplir(qmex );
		nv2.remplir(qjapon); 
		nv2.remplir(qmar);
		nv2.remplir(qag );
		
		
		
		nv3.remplir( qpe);
		nv3.remplir( qafg); 
		nv3.remplir(qbrz );
		nv3.remplir(qtur );
		nv3.remplir(qqa);
		nv3.remplir(qegy);
		nv3.remplir(qcds);
		nv3.remplir( qaustr); 
		nv3.remplir(qur);
		nv3.remplir(qse );
		nv3.remplir(qda );
		
 
		
		nv4.remplir( qli);
		nv4.remplir( qcroatie); 
		nv4.remplir(qlib );
		nv4.remplir( qfila);
		nv4.remplir( qequa);
		nv4.remplir(qja );
	        nv4.remplir(qgh );
		nv4.remplir(qksa);
		nv4.remplir( qslov); 
		
		

	        nv5.remplir(qpara);
		nv5.remplir( qcuba );
	        nv5.remplir( qcolombie); 
		nv5.remplir(qnigeria );
		nv5.remplir( qcam);
	        nv5.remplir(qukra );
	        nv5.remplir( qidoni);
	        nv5.remplir( qgui );
	        nv5.remplir( qmali );
	        nv5.remplir( qniger );
		
		
		
		


	        nv6.remplir(qba); 
	        nv6.remplir(qto);
	        nv6.remplir(qga );
	        nv6.remplir( qci);
		nv6.remplir( qbie );
	        nv6.remplir( qsue);
	        nv6.remplir( qcosta); 
	        nv6.remplir( qnorvege);
	        nv6.remplir( qbosnie );
	        nv6.remplir(qpakistan );
		
		
		nv7.remplir (qchili);
		nv7.remplir(qmozanbique);
		nv7.remplir( qgabon);
		nv7.remplir(qpologne);
		nv7.remplir( qbulgarie); 
		nv7.remplir(qvenezuela );
		nv7.remplir(qan); 
		nv7.remplir(qne);
		nv7.remplir(qka);
		nv7.remplir( qalbanie);
		
		
		
		
	        nv8.remplir(qcoréedunord);
		nv8.remplir(qestonie);
		nv8.remplir( qfidji );
		nv8.remplir( qvietnam );
		nv8.remplir( qbotswana);
		nv8.remplir( qchypre);
		nv8.remplir(qbangladesh); 
		nv8.remplir( qburkina);
		nv8.remplir( qczambie );
		nv8.remplir(qni );
		

        initComponents();
         ImageIcon menu=new ImageIcon(getClass().getResource("/world.png"));
             this.setIconImage (menu.getImage());
              this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        defaultJl2 = new javax.swing.JLabel();
        nv1But = new javax.swing.JButton();
        nv2But = new javax.swing.JButton();
        nv3But = new javax.swing.JButton();
        nv4But = new javax.swing.JButton();
        nv5But = new javax.swing.JButton();
        nv6But = new javax.swing.JButton();
        nv7But = new javax.swing.JButton();
        nv8But = new javax.swing.JButton();
        Exit = new javax.swing.JLabel();
        FrameDag = new javax.swing.JLabel();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMinimumSize(new java.awt.Dimension(980, 617));
        setUndecorated(true);
        getContentPane().setLayout(null);

        defaultJl2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/defaultsimple.png"))); // NOI18N
        defaultJl2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        defaultJl2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                defaultJl2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                defaultJl2MouseExited(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                defaultJl2MouseReleased(evt);
            }
        });
        getContentPane().add(defaultJl2);
        defaultJl2.setBounds(897, -1, 30, 30);

        nv1But.setText("Niveau 1");
        nv1But.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nv1ButActionPerformed(evt);
            }
        });
        getContentPane().add(nv1But);
        nv1But.setBounds(170, 150, 130, 30);

        nv2But.setText("Niveau 2");
        nv2But.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nv2ButActionPerformed(evt);
            }
        });
        getContentPane().add(nv2But);
        nv2But.setBounds(170, 220, 130, 30);

        nv3But.setText("Niveau 3");
        nv3But.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nv3ButActionPerformed(evt);
            }
        });
        getContentPane().add(nv3But);
        nv3But.setBounds(170, 290, 130, 30);

        nv4But.setText("Niveau 4");
        nv4But.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nv4ButActionPerformed(evt);
            }
        });
        getContentPane().add(nv4But);
        nv4But.setBounds(170, 360, 130, 30);

        nv5But.setText("Niveau 5");
        nv5But.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nv5ButActionPerformed(evt);
            }
        });
        getContentPane().add(nv5But);
        nv5But.setBounds(670, 150, 130, 30);

        nv6But.setText("Niveau 6");
        nv6But.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nv6ButActionPerformed(evt);
            }
        });
        getContentPane().add(nv6But);
        nv6But.setBounds(670, 220, 130, 30);

        nv7But.setText("Niveau 7");
        nv7But.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nv7ButActionPerformed(evt);
            }
        });
        getContentPane().add(nv7But);
        nv7But.setBounds(670, 290, 130, 30);

        nv8But.setText("Niveau 8");
        nv8But.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nv8ButActionPerformed(evt);
            }
        });
        getContentPane().add(nv8But);
        nv8But.setBounds(670, 360, 130, 30);

        Exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ExitSimple.png"))); // NOI18N
        Exit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ExitMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ExitMouseExited(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                ExitMouseReleased(evt);
            }
        });
        getContentPane().add(Exit);
        Exit.setBounds(935, -2, 30, 30);

        FrameDag.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                FrameDagMouseDragged(evt);
            }
        });
        FrameDag.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                FrameDagMousePressed(evt);
            }
        });
        getContentPane().add(FrameDag);
        FrameDag.setBounds(0, 0, 980, 40);

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/NiveauBackground.png"))); // NOI18N
        getContentPane().add(background);
        background.setBounds(0, 0, 990, 610);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nv1ButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nv1ButActionPerformed
         
        this.setVisible(false);
        nv=nv1;
                nv1.affichage();
              
	

                
    }//GEN-LAST:event_nv1ButActionPerformed

    private void nv2ButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nv2ButActionPerformed
             this.setVisible(false);
        nv=nv2;
                nv2.affichage();
              
    }//GEN-LAST:event_nv2ButActionPerformed

    private void nv3ButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nv3ButActionPerformed
        // TODO add your handling code here:
           
	 this.setVisible(false);
        nv=nv3;
        nv3.affichage();
              
                
    }//GEN-LAST:event_nv3ButActionPerformed

    private void nv4ButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nv4ButActionPerformed
        // TODO add your  this.setVisible(false);
        this.setVisible (false);
        nv=nv4;
         nv4.affichage();
             
             
    }//GEN-LAST:event_nv4ButActionPerformed

    private void nv5ButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nv5ButActionPerformed
        // TODO add your handling code here:
         this.setVisible(false);
        nv=nv5;
        nv5.affichage();
    }//GEN-LAST:event_nv5ButActionPerformed

    private void FrameDagMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FrameDagMouseDragged
        // TODO add your handling code here:
         int x=evt.getXOnScreen();
     int y=evt.getYOnScreen();
    this.setLocation(x-xMouse, y-yMouse);
    }//GEN-LAST:event_FrameDagMouseDragged

    private void FrameDagMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FrameDagMousePressed
        // TODO add your handling code here:
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_FrameDagMousePressed

    private void nv6ButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nv6ButActionPerformed
        // TODO add your handling code here:
           this.setVisible(false);
        nv=nv6;
        nv6.affichage();
    }//GEN-LAST:event_nv6ButActionPerformed

    private void nv7ButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nv7ButActionPerformed
        // TODO add your handling code here:
           this.setVisible(false);
        nv=nv7;
        nv7.affichage();
    }//GEN-LAST:event_nv7ButActionPerformed

    private void nv8ButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nv8ButActionPerformed
        // TODO add your handling code here:
           this.setVisible(false);
        nv=nv8;
        nv8.affichage();
    }//GEN-LAST:event_nv8ButActionPerformed

    private void ExitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExitMouseEntered

        ImageIcon exitIcon = new ImageIcon (getClass().getResource("/exitnt.png"));
        Exit.setIcon(exitIcon);
    }//GEN-LAST:event_ExitMouseEntered

    private void ExitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExitMouseExited

        ImageIcon exitIcon = new ImageIcon (getClass().getResource("/ExitSimple.png"));
        Exit.setIcon(exitIcon);
    }//GEN-LAST:event_ExitMouseExited

    private void ExitMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExitMouseReleased
        System.exit(0);
    }//GEN-LAST:event_ExitMouseReleased

    private void defaultJl2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_defaultJl2MouseEntered
        // TODO add your handling code here:
        ImageIcon exitIcon = new ImageIcon (getClass().getResource("/defaultIN.png"));
        defaultJl2.setIcon(exitIcon);
    }//GEN-LAST:event_defaultJl2MouseEntered

    private void defaultJl2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_defaultJl2MouseExited
        ImageIcon exitIcon = new ImageIcon (getClass().getResource("/defaultsimple.png"));
        defaultJl2.setIcon(exitIcon);
    }//GEN-LAST:event_defaultJl2MouseExited

    private void defaultJl2MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_defaultJl2MouseReleased
        this.setExtendedState(MenuJFrame.ICONIFIED);
    }//GEN-LAST:event_defaultJl2MouseReleased

    /**
     * @param args the command line arguments
     */
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Exit;
    private javax.swing.JLabel FrameDag;
    private javax.swing.JLabel background;
    private javax.swing.JLabel defaultJl2;
    private static javax.swing.JButton nv1But;
    private static javax.swing.JButton nv2But;
    private static javax.swing.JButton nv3But;
    private static javax.swing.JButton nv4But;
    private javax.swing.JButton nv5But;
    private javax.swing.JButton nv6But;
    private javax.swing.JButton nv7But;
    private javax.swing.JButton nv8But;
    // End of variables declaration//GEN-END:variables
}
