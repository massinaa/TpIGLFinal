import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by massina on 11/10/2017.
 */
public class VectorHelperTest {
    /**
     * Test of method trier of class VectorHelper.
     */
    @Test
    public void test_trier() throws Exception {
        int[] tab=new int[]{14,5,-1,2,3,0,-16,27,3,2,3};
        int[] tab2=new int[0];
        int[] resCroissant=new int[]{-16,-1,0,2,2,3,3,3,5,14,27};
        int[] resDecroissant=new int[]{27,14,5,3,3,3,2,2,0,-1,-16};
        assertArrayEquals(resCroissant,VectorHelper.trier(tab,true));
        assertArrayEquals(resDecroissant,VectorHelper.trier(tab,false));
        assertArrayEquals(tab2,VectorHelper.trier(tab2,true));
    }

    /**
     * Test of min_max method, of class VectorHelper.
     */
    @Test
    public void test_min_max() throws Exception {
        int[] tab=new int[]{5,-1,2,3,0,0,13,-14,256};
        int[] res=new int[]{-14,7,256,8};
        int[] res_func;
        res_func=VectorHelper.min_max(tab);
        assertArrayEquals(res,res_func);
    }

    /**
     * Test of inverser method, of class VectorHelper.
     */
    @Test
    public void test_inverser(){
        int[] tab1=new int[]{0,1,2,3,4,5,6,7,8};
        int[] tab2=new int[]{1};
        int[] res= new int[]{8,7,6,5,4,3,2,1,0};
        assertArrayEquals(res,VectorHelper.inverser(tab1));
        assertArrayEquals(tab2,VectorHelper.inverser(tab2));
    }


    /**
     * Test of SommeTableaux method, of class VectorHelper.
     */
    @Test
    public void testSommeTableaux() throws Exception {
        System.out.println("SommeTableaux");
        int[] tab1 = {1,2,3,4};
        int[] tab2 = {9,3,7,9};
        int[] tab3={2,3};

        int[] expResult = {10,5,10,13};
        int[] result = VectorHelper.SommeTableaux(tab1,tab2);
        assertArrayEquals(expResult, result);
        assertArrayEquals(null,VectorHelper.SommeTableaux(tab2,tab3));

    }
    /**
     * Test of AppliquerFormuleTableaux method, of class VectorHelper.
     */
    @Test
    public void testAppliquerFormuleTableaux() {
        System.out.println("AppliquerFormuleTableaux");
        int[] tab = {1,2,3,4};;
        int[] expResult = {19,21,23,25};
        int[] result = VectorHelper.AppliquerFormuleTableaux(tab);
        assertArrayEquals(expResult, result);

    }

}