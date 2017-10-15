/**
 * Created by massina on 11/10/2017.
 */
public class VectorHelper {


    public static int[] trier(int [] tab , boolean sens){
        int i,p;
        int tmp;
        int taille=tab.length;
        int m=taille-1;
        if (sens){
            for (i=0;i<taille-1;i++){
                for (p=0;p<m;p++){
                    if (tab[p]>tab[p+1]){
                        tmp=tab[p];
                        tab[p]=tab[p+1];
                        tab[p+1]=tmp;
                    }
                }
                m=m-1;
            }
        }else{
            for (i=0;i<taille-1;i++){
                for (p=0;p<m;p++){
                    if (tab[p]<tab[p+1]){
                        tmp=tab[p];
                        tab[p]=tab[p+1];
                        tab[p+1]=tmp;
                    }
                }
                m=m-1;
            }

        }


        return(tab);
    }
    public static int[] min_max ( int [] tab ){
        int res[]= new int[4];
        int i;


        for(i=0;i<tab.length;i++){
            if (i==0){
                res[0]=tab[0];
                res[1]=0;
                res[2]=tab[0];
                res[3]=0;
            }else{
                if (tab[i]<res[0]){
                    res[0]=tab[i];
                    res[1]=i;

                }
                if (tab[i]>res[2]){
                    res[2]=tab[i];
                    res[3]=i;
                }

            }
        }

        return (res);
    }


    public static int[] inverser(int[] tab){
        int taille=tab.length;
        int[] res = new int[taille];
        int i,p=taille-1;
        for(i=0; i<taille; i++){
            res[p]=tab[i];
            p=p-1;
        }
        return(res);
    }



    public static void afficher_tab(int[]tab){
        int i;
        for(i=0;i<tab.length;i++){
            System.out.print(tab[i]+" ");
        }
        System.out.println();
    }


}

