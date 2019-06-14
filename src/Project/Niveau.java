package Project;

import java.util.ArrayList;

public class Niveau {
      private  ScoreJFrame scoreFrame ;
	private int n;
        
	private  int score;
	private int nbrq;
	private ArrayList list = new ArrayList();
       
	public Niveau (){
        list.removeAll(list);
        	
         this.score=0;
         this.nbrq=0;
         n=-1;
         
         scoreFrame=new ScoreJFrame();
	}
	public void remplir (Question q){
	   list.add(q);
	   nbrq++;
          
	}
	public String correction() {
		String corr=""; 
            for (int i=0; i< list.size();i++)
              {
		if (((Question) list.get(i)).getJouer().getChoix()==0){
                  corr = "<html>"+((Question) list.get(i)).getPays().affichage()+"<br/>"+corr+"<html>";
                  
                }
              }return corr;
        }
	
	public void affichage() {
		
                n++;
		
		         
                        ((Question) list.get(n)).affichage();
                     
			
      
                     
				
        }
		
        public Question getQuestion(){
            return((Question) list.get(n));
        }
            	
		
		
        public   ScoreJFrame getScoreFrame(){ 
            return scoreFrame;
        }
        public int getNbrq(){
            return nbrq;
        }
       public int getN(){
           return n;
       }
      
     
	public void score(){
            
              for (int i=0; i< list.size();i++)
              {
		score =((Question) list.get(i)).getJouer().getChoix()+score;
                            }
		String msg="null !! ";
		double  d=((double)score/(double)nbrq);
		scoreFrame.getScrLbl().setText ("Votre Score est "+score+"/"+nbrq);	
		 if (d ==1 )
	    	msg="Bravo !!";
	     if (d <1 && d >=0.7)
	    	msg="Trés  Bien !!";
		 if (d < 0.7 && d >= 0.5)
	    	msg="Bien !!";
	     if (d < 0.5 && d >= 0.3)
	    	msg="Assez Bien !! ";
	  scoreFrame.getMsgLbl().setText(msg);
          scoreFrame.setVisible(true);
       
	    
	    
			
		}
	
			
		
			

}
