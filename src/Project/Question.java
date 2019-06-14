package Project;

import java.util.ArrayList;
import javax.swing.ImageIcon;
import static jdk.nashorn.internal.objects.NativeDebug.getClass;


public class Question {
	private QuestionJFrame j;
	private String reponse1;
	private String reponse2;

	
	
	private Pays pays;
	
	private int nbr;
	public Question (Pays p,String reponse1,String reponse2){
                this.j=new QuestionJFrame();
                j.setVisible(false);
		this.reponse1=reponse1;
		this.reponse2=reponse2;
		this.pays=p;
		if (reponse1.equals(p.getCapitale()))
		 this.reponse1="Sfax";
		if (reponse2.equals(p.getCapitale()))
			this.reponse2="Barcelone";
	}
	public void affichage(){
		String str;
		char c =pays.getNom().charAt(0);
	
		
		if (c=='A' || c=='Y' ||  c=='O'||  c=='I'||  c=='U' || c=='E')
			str="de l'";
		else if (pays.getMasculin())
			str="du ";
		else str="de la ";
                if ((pays.getNom().equals("États-Unis"))|| (pays.getNom().equals("Royaume-Uni")) || (pays.getNom().equals("Pays-Bas")))
                        str="des ";
 	
	     j.getQuestionLbl().setText("- Quelle est la capitale "+str+pays.getNom()+" ?");
             String tt="/"+pays.getNom()+".png";
             ImageIcon II=new ImageIcon(getClass().getResource(tt));
             j.getImageLbl().setIcon (II);
	     random();
             j.setVisible(true);
             
            
	    
	   
	  
		
		
	}
      private void random(){
		 nbr = 1 + (int)(Math.random() * ((3 - 1) + 1));
		if (nbr==1){
			j.getBox1().setText(pays.getCapitale());
			j.getBox2().setText (reponse1);
			j.getBox3().setText (reponse2);
			
		}
			

		if (nbr==2){
			j.getBox1().setText (reponse1);
			j.getBox2().setText(pays.getCapitale());
			j.getBox3().setText (reponse2);
		}
			

		if (nbr==3){
			j.getBox1().setText(reponse2);
			j.getBox2().setText(reponse1);
		        j.getBox3().setText (pays.getCapitale());
		
		}
			
	}
    
      
    	  
      
    	  
     
      public Pays getPays(){
    	  return pays;
      }
      public int getNbr(){
          return nbr;
      }
     
public QuestionJFrame getJouer() {
    return j;
}

   
}