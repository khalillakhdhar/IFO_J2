package testes;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import classes.Produit;

public class TUnitaire {
Produit p;
@Before
public void beforeEverything()
{
p=new Produit("voitures",10000,"imp fiat",20);

}
@Test
public void testPrix()
{
Assert.assertEquals(true, p.verifPrix());	

}
@Test
public void testQuantite()
{
Assert.assertEquals(true, p.verifQuantite());	

}
@Test
public void testType()
{
	
Assert.assertEquals(true,p.contenueType());

}

}
