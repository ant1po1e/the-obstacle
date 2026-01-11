import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Level1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Level1 extends World
{
    /**
     * Constructor for objects of class Level1.
     * 
     */
    public Level1()
    {    
        super(800, 600, 1); 
        prepare();
    }
    
    public void resetWorld()
    {
        Greenfoot.setWorld(new Level1());
    }
    
    private void prepare()
    {

        batupanjang batupanjang = new batupanjang();
        addObject(batupanjang,572,591);
        batu2 batu2 = new batu2();
        addObject(batu2,263,472);
        removeObject(batu2);
        batupanjang batupanjang2 = new batupanjang();
        addObject(batupanjang2,117,589);
        batupanjang2.setLocation(153,586);
        batupanjang2.setLocation(157,584);
        batupanjang2.setLocation(157,584);
        batupanjang2.setLocation(166,591);
        batupanjang2.setLocation(166,591);
        sandd sandd = new sandd();
        addObject(sandd,74,467);
        sandland sandland = new sandland();
        addObject(sandland,579,528);
        sandd sandd2 = new sandd();
        addObject(sandd2,774,467);
        tanahbatu tanahbatu = new tanahbatu();
        addObject(tanahbatu,294,249);
        removeObject(tanahbatu);
        kotak kotak = new kotak();
        addObject(kotak,784,337);
        kitakkecil kitakkecil = new kitakkecil();
        addObject(kitakkecil,560,437);
        kitakkecil.setLocation(512,462);
        kitakkecil.setLocation(510,465);
        kotakpanjang kotakpanjang = new kotakpanjang();
        addObject(kotakpanjang,693,447);
        sandd.setLocation(48,563);
        addObject(tanahbatu,48,563);
        removeObject(tanahbatu);
        wood1 kayu = new wood1();
        addObject(kayu,2,488);
        wood2 kayu2 = new wood2();
        addObject(kayu2,3,314);
        wood1 kayu3 = new wood1();
        addObject(kayu3,4,140);
        kayu3.setLocation(-7,160);
        wood2 kayu22 = new wood2();
        addObject(kayu22,66,137);
        kayu22.setLocation(-12,-13);
        kayu22.setLocation(-7,-28);
        removeObject(kayu22);
        addObject(kayu22,3,5);
        kayu22.setLocation(4,27);
        kayu22.setLocation(4,27);
        kayu2.setLocation(8,270);
        kayu2.setLocation(4,350);
        sandd.setLocation(4,350);
        kayu2.setLocation(8,288);
        kayu2.setLocation(6,315);
        sandd.setLocation(4,458);
        sandd.setLocation(4,458);
        sandd.setLocation(5,486);
        kayu3.setLocation(8,187);
        kayu3.setLocation(5,146);
        kayu3.setLocation(6,144);
        kayu22.setLocation(2,48);
        kayu22.setLocation(6,48);
        kayu22.setLocation(6,48);
        kayu3.setLocation(6,73);
        kayu3.setLocation(6,73);
        kayu3.setLocation(4,39);
        kayu22.setLocation(6,33);
        kayubwah kayubwah = new kayubwah();
        addObject(kayubwah,314,4);
        kayubwah kayubwah2 = new kayubwah();
        addObject(kayubwah2,776,4);
        sandd.setLocation(99,415);
        sand sand = new sand();
        addObject(sand,408,560);
        sand.setLocation(422,561);
        sand.setLocation(406,562);
        sand.setLocation(406,560);
        kotakpanjang kotakpanjang2 = new kotakpanjang();
        addObject(kotakpanjang2,154,560);
        kotak kotak2 = new kotak();
        addObject(kotak2,177,568);
        sandd.setLocation(84,400);
        sandd.setLocation(82,466);
        sandd.setLocation(347,549);
        kotakpanjang2.setLocation(346,572);
        kotakpanjang2.setLocation(346,560);
        kotak2.setLocation(169,555);
        kotak2.setLocation(169,555);
        kotak2.setLocation(173,567);
        kotak2.setLocation(171,567);
        kotak2.setLocation(174,567);
        kotak2.setLocation(171,570);
        kayu3.setLocation(2,220);
        kayu3.setLocation(6,147);
        kayu.setLocation(56,442);
        kayu.setLocation(56,442);
        removeObject(kayu);
        addObject(kayu,6,490);
        sandd.setLocation(90,355);
        sandd.setLocation(86,466);
        kotak2.setLocation(182,567);
        kotak2.setLocation(177,567);
        kotak2.setLocation(177,568);
        saw saw = new saw();
        addObject(saw,217,565);
        saw saw2 = new saw();
        addObject(saw2,255,564);
        saw saw3 = new saw();
        addObject(saw3,294,564);
        saw3.setLocation(286,563);
        saw3.setLocation(297,564);
        saw2.setLocation(250,565);
        saw2.setLocation(258,565);
        kotak2.setLocation(173,566);
        kotak2.setLocation(444,520);
        saw.setLocation(171,562);
        saw.setLocation(171,562);
        saw.setLocation(183,564);
        saw2.setLocation(223,563);
        saw2.setLocation(217,561);
        saw2.setLocation(222,560);
        saw2.setLocation(223,564);
        saw3.setLocation(263,564);
        saw saw4 = new saw();
        addObject(saw4,307,564);
        saw3.setLocation(258,564);
        saw3.setLocation(267,564);
        saw2.setLocation(225,558);
        saw2.setLocation(225,563);
        matahari matahari = new matahari();
        addObject(matahari,693,76);
        cloud cloud = new cloud();
        addObject(cloud,121,74);
        cloud cloud2 = new cloud();
        addObject(cloud2,196,82);
        cloud cloud3 = new cloud();
        addObject(cloud3,372,79);
        cloud cloud4 = new cloud();
        addObject(cloud4,546,78);
        kotakpanjang.setLocation(686,456);
        kotakpanjang.setLocation(484,452);
        sandd2.setLocation(707,441);
        sandd2.setLocation(707,441);
        sandd2.setLocation(728,468);
        kotakpanjang.setLocation(642,435);
        kotakpanjang.setLocation(642,435);
        kotakpanjang.setLocation(648,448);
        end end = new end();
        addObject(end,784,286);
        end.setLocation(784,289);
        end.setLocation(776,291);
        kotak.setLocation(792,328);
        kotak.setLocation(785,335);
        kotak kotak3 = new kotak();
        addObject(kotak3,753,334);
        end.setLocation(752,324);
        kotak3.setLocation(753,337);
        end.setLocation(750,268);
        kotak3.setLocation(754,332);
        kotak3.setLocation(753,333);
        kotak3.setLocation(753,336);
        kotak3.setLocation(753,336);
        kotak3.setLocation(753,335);
        end.setLocation(766,292);
        end.setLocation(768,286);
        pijakan pijakan = new pijakan();
        addObject(pijakan,233,340);
        pijakan pijakan2 = new pijakan();
        addObject(pijakan2,340,340);
        pijakan pijakan3 = new pijakan();
        addObject(pijakan3,430,340);
        pijakan3.setLocation(437,340);
        pijakan3.setLocation(445,341);
        pijakan pijakan4 = new pijakan();
        addObject(pijakan4,560,345);
        pijakan2.setLocation(336,316);
        pijakan3.setLocation(435,298);
        pijakan4.setLocation(556,344);
        pijakan4.setLocation(543,343);
        pijakan4.setLocation(512,278);
        pijakan4.setLocation(538,279);
        pijakan2.setLocation(314,312);
        pijakan3.setLocation(433,296);
        pijakan3.setLocation(424,296);
        pijakan3.setLocation(385,284);
        pijakan4.setLocation(464,260);
        pijakan pijakan5 = new pijakan();
        addObject(pijakan5,556,282);
        pijakan pijakan6 = new pijakan();
        addObject(pijakan6,650,317);
        pijakan4.setLocation(468,238);
        pijakan4.setLocation(468,238);
        pijakan2.setLocation(304,308);
        pijakan3.setLocation(384,275);
        pijakan5.setLocation(555,277);
        pijakan5.setLocation(556,277);
        level level = new level();
        addObject(level,32,27);
        cloud3.setLocation(533,101);
        cloud3.setLocation(546,110);
        cloud cloud5 = new cloud();
        addObject(cloud5,773,141);
        cloud cloud6 = new cloud();
        addObject(cloud6,33,138);
        cloud.setLocation(45,152);
        removeObject(cloud);
        cloud2.setLocation(103,78);
        cloud2.setLocation(187,87);
        cloud2.setLocation(131,69);
        cloud2.setLocation(181,87);
        cloud2.setLocation(109,76);
        cloud2.setLocation(185,78);
        cloud2.setLocation(117,76);
        cloud2.setLocation(195,66);
        cloud2.setLocation(127,78);
        cloud2.setLocation(127,78);
        cloud2.setLocation(147,204);
        cloud6.setLocation(147,204);
        cloud2.setLocation(291,160);
        cloud2.setLocation(92,150);
        cloud2.setLocation(285,140);
        cloud2.setLocation(357,87);
        cloud2.setLocation(245,164);
        cloud2.setLocation(245,164);
        cloud2.setLocation(100,130);
        cloud6.setLocation(100,130);
        cloud2.setLocation(171,140);
        cloud2.setLocation(173,144);
        cloud2.setLocation(67,125);
        cloud2.setLocation(86,123);
        cloud2.setLocation(197,134);
        cloud2.setLocation(76,122);
        cloud2.setLocation(76,122);
        cloud2.setLocation(121,121);
        kotakpanjang.setLocation(642,449);
        kotakpanjang.setLocation(646,448);
        cloud3.setLocation(360,76);
        cloud2.setLocation(275,86);
        cloud2.setLocation(175,117);
        cloud2.setLocation(159,100);
        point1 point1 = new point1();
        addObject(point1,231,327);
        point2 point2 = new point2();
        addObject(point2,302,292);
        point3 point3 = new point3();
        addObject(point3,382,258);
        point4 point4 = new point4();
        addObject(point4,467,222);
        point5 point5 = new point5();
        addObject(point5,554,260);
        point6 point6 = new point6();
        addObject(point6,642,302);
        removeObject(point6);
        point6 point62 = new point6();
        addObject(point62,649,304);
        kotak2.setLocation(435,529);
        kotak3.setLocation(738,345);
        kotak.setLocation(772,344);
        kotak3.setLocation(732,344);
        kotak.setLocation(771,343);
        kotak.setLocation(767,341);
        kotak.setLocation(776,344);
        end.setLocation(764,318);
        end.setLocation(755,302);
        pijakan2.setLocation(312,310);
        pijakan2.setLocation(304,307);
        removeObject(point2);
        pijakan2.setLocation(290,308);
        removeObject(pijakan2);
        pijakan6.setLocation(633,318);
        removeObject(point62);
        pijakan6.setLocation(670,319);
        pijakan6.setLocation(639,319);
        removeObject(pijakan6);
        orangnya orangnya = new orangnya();
        addObject(orangnya,79,324);
        orangnya.setLocation(90,336);
        orangnya.setLocation(104,333);
        orangnya.setLocation(108,328);
        orangnya.setLocation(88,340);
        orangnya.setLocation(88,323);
        orangnya.setLocation(88,326);
        removeObject(level);
    }
    
    public void act()
    {
        orangnya player = getObjects(orangnya.class).get(0);
        showText("Score: " + player.getScore(), 60, 20);
    }
}
