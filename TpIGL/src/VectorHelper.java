/**
 * Classe permettant de Trier un tableau,inverser un tableau,calculer le min et le max simultanement
 * d'un tableau,calculer la somme de deux tableax,appliquer la formule(((X+9)*2)-1) a tout les elements
 * d'un tableau tel que X represente l'element du tableau  sur lequel on va appliquer cette formule.

 * @author Hamoud Radja et Abderrahman Massina.
 * @version 3.0
 */
public class VectorHelper {

    /**
     *cette methode fait le tri du tableau donné en entrée.
     * @param  tab  est un tableau  à trier de type entier.
     * @param  sens est un boolean qui indique le sens de tri croissant/décroissant.
     * @return  cette methode retourne le tableau en entrée trié
     */

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

    /**
     *cette methode fait le tri du tableau donné en entrée.
     * @param  tab  est un tableau de type entier pour lequel on calcule le min et le max.
     * @return  cette methode retourne le tableau res qui contient le min le max et leurs position.
     */
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

    /**
     *cette methode inverse tableau donné en entrée.
     * @param  tab  est un tableau de type entier que on va inverser.
     * @return  cette methode retourne le tableau en entrée inversé.
     */
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


    /**
     *cette methode affiche le tableau donné en entrée.
     * @param  tab  est un tableau que on va afficher ses éléments.

     */
    public static void afficher_tab(int[]tab){
        int i;
        for(i=0;i<tab.length;i++){
            System.out.print(tab[i]+" ");
        }
        System.out.println();
    }

    /**
     *cette methode fait la somme  des deux  tableaux donnés en entrée.
     * @param  tab1  est le premier tableau.
     * @param  tab2  est le deusiéme tableau.
     * @return  cette methode retourne un tableau qui contient la somme des tableaux donnés en entrée.
     * @throws  NoEquelTableLengthException si les deux tableaux nont pas la meme taille.
     */
    public static int [] SommeTableaux (int [] tab1,int [] tab2)throws NoEquelTableLengthException
    {
        int taille1=tab1.length;
        int taille2=tab2.length;
        int[] res=null;
        if(taille1!=taille2)
        {
            return res;
            //throw new NoEquelTableLengthException();
        }
        if(taille1==taille2)
        {
            res= new int [taille1];
            int i;
            for(i=0;i<taille1;i++)
            {
                res[i]=tab1[i]+  tab2 [i];
            }

        }
        return res;
    }

    /**
     *cette methode applique une formule à l'élément donné en entrée.
     * @param  n est un entier
     * @return  cette methode retourne le resultat de l'application de la formule sur n.
     */
    public static int formule(int n)
    {
        return (((n+9)*2)-1);
    }
    /**
     *cette methode applique une méthode à tout les éléments du tableau donné en entrée.
     * @param  tab est un tableau d'entier.
     * @return  cette methode retourne le tableau en entré aprés l'application de la méthode.
     */
    public static int [] AppliquerFormuleTableaux(int [] tab)
    {
        int taille=tab.length;
        int []res=new int[taille];
        int i;
        for(i=0;i<taille;i++)
        {
            res[i]=formule(tab[i]);
        }
        return res;
    }


}

