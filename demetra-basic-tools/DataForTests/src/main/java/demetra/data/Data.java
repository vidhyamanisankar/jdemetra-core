/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demetra.data;

import demetra.timeseries.TsPeriod;
import demetra.timeseries.TsData;

/**
 *
 * @author Jean Palate <jean.palate@nbb.be>
 */
public class Data {

    public static final double[] EXPORTS = {
        9568.3, 9920.3, 11353.5, 9247.5, 10114.2, 10763.1, 8456.1, 8071.6, 10328, 10551.4, 10186.1, 8821.6,
        9841.3, 10233.6, 10794.6, 10289.3, 10513.4, 10607.6, 9707.4, 8103.5, 10982.6, 11836.9, 10517.5, 9810.5,
        10374.8, 10855.3, 11671.3, 11901.2, 10846.4, 11917.5, 11362.8, 9314.5, 12605.9, 12815.1, 11254.5, 11111.8,
        11282.9, 11554.5, 12935.6, 12146.3, 11615.3, 13214.8, 11735.5, 9522.3, 12694.8, 12317.6, 11450, 11380.9,
        10604.6, 10972.2, 13331.5, 11733.1, 11284.7, 13295.8, 11881.4, 10374.2, 13828, 13490.5, 13092.2, 13184.4,
        12398.4, 13882.3, 15861.5, 13286.1, 15634.9, 14211, 13646.8, 12224.6, 15916.4, 16535.9, 15796, 14418.6,
        15044.5, 14944.2, 16754.8, 14254, 15454.9, 15644.8, 14568.3, 12520.2, 14803, 15873.2, 14755.3, 12875.1,
        14291.1, 14205.3, 15859.4, 15258.9, 15498.6, 15106.5, 15023.6, 12083, 15761.3, 16943, 15070.3, 13659.6,
        14768.9, 14725.1, 15998.1, 15370.6, 14956.9, 15469.7, 15101.8, 11703.7, 16283.6, 16726.5, 14968.9, 14861,
        14583.3, 15305.8, 17903.9, 16379.4, 15420.3, 17870.5, 15912.8, 13866.5, 17823.2, 17872, 17420.4, 16704.4,
        15991.5, 16583.6, 19123.4, 17838.8, 17335.3, 19026.9, 16428.6, 15337.4, 19379.8, 18070.5, 19563, 18190.6,
        17658, 18437.9, 21510.4, 17111, 19732.7, 20221.8
    };
    public static final double[] PROD = {
        59.2, 58.3, 63.4, 59.7, 58.9, 62.7, 47.6, 58.6, 64.4, 66.4, 64.2, 62.2, 61.7, 62.2, 65.5, 64.6, 64.6, 62.2, 53.2, 62.5, 68.5, 73.5, 67.1, 68.6,
        69.1, 65.5, 72.7, 73, 70.3, 73.5, 61.5, 67.6, 77.7, 81.7, 73.5, 75.4, 70.6, 70.8, 76.9, 77.7, 71.1, 77.3, 63.1, 70.8, 80.5, 82.7, 75.8, 79.3,
        72.3, 74, 82.7, 79.1, 74.4, 79.5, 61.9, 73.5, 83.1, 82.9, 78, 80.4, 77.7, 79, 88.1, 79.5, 80.9, 85.7, 61.2, 78.7, 87.6, 91.5, 88.5, 86.6,
        86.8, 84.7, 94.1, 86.9, 90.2, 86.1, 68.8, 86.9, 90.7, 99.6, 94.9, 88.2, 95.2, 91.9, 97.5, 96.4, 95.2, 91.8, 74.7, 86.7, 96.2, 100.6, 89.7, 85.7,
        88.5, 83.8, 86.3, 86.7, 79, 84.2, 64.6, 72.6, 88.2, 91.1, 84, 85.8, 86.1, 88, 97.6, 95.3, 89.1, 93.5, 69.4, 86, 99.1, 97.3, 92.9, 92.7,
        90.2, 89.7, 102.3, 92, 89.1, 95.2, 67, 88.1, 95.6, 94.2, 93, 92.2, 91.5, 88.9, 99.1, 93.6, 91.5, 94.6, 67.6, 89.8, 99.3, 103.7, 100.3, 94.8,
        92.2, 93.8, 103.5, 98.8, 99.2, 99.5, 75.6, 96, 102.1, 109.3, 103.3, 96.3, 104.5, 102.8, 105.8, 102.3, 93.7, 99, 73, 87.9, 100.1, 103.8, 90.9, 89.1,
        91.6, 92.5, 100.3, 97.5, 90.4, 96.4, 70.8, 86.7, 102.5, 103.7, 96.8, 93.7, 93.4, 92.5, 99.9, 99.6, 91.5, 99.7, 70.6, 88.1, 102, 101.1, 94, 92.3,
        94.4, 93, 103.9, 96.1, 94.3, 102.2, 70, 93.5, 102.3, 102.5, 101.4, 94.5, 100.5, 100, 105.1, 96.3, 102.1, 97.8, 75.1, 94.3, 102, 110.4, 102.8, 92.9,
        99.4, 97.2, 105.5, 102.6, 99.7, 101, 79.6, 93.5, 107.7, 114, 104.5, 95.4, 104.1, 100.6, 104.6, 109, 95.7, 104.4, 82.5, 93.5, 109.6, 113.4, 100.6, 97.8,
        101.2, 101.7, 110.8, 108.7, 101.8, 107.2, 83, 97.5, 114.3, 116.4, 107.5, 101.5, 108.5, 109.3, 119, 111.3, 108.5, 117.5, 84.7, 107, 121.8, 117.7, 116, 108.5,
        118.4, 113, 122.5, 117.1, 112, 122.6, 90.2, 112.3, 122.4, 125.4, 120.7, 107.2, 126.8, 118.8, 132.9, 117.7, 121.8, 123.9, 90.3, 113.2, 124.7, 135.4, 126.3, 110.1,
        126.8, 117.7, 126.6, 123, 118.1, 123.7, 93.5, 105.4, 125, 131.9, 119.9, 110.3, 126.2, 121.6, 130.9, 123.6, 116.1, 126.9, 95, 107.6, 128.4, 127.1, 116.3, 109.5,
        113.4, 114, 128.5, 118.3, 108.6, 124.2, 86.7, 104.2, 124.1, 121.2, 112.6, 114.1, 120.3, 117.6, 133.6, 117.7, 113.8, 126.6, 81.6, 108.7, 125.9, 123, 120.7, 109.7};

    public static final double[] M1
            = {
                1320.7, 1353.9, 1604.3, 1335.2, 1365.7, 1578.3, 1160.5, 1161.9, 1450.8, 1462, 1431.5, 1396.9,
                1375.6, 1445.4, 1548, 1477.4, 1488, 1486.9, 1260.4, 1171.6, 1585.7, 1668.5, 1446.5, 1505.4,
                1399.5, 1456.7, 1554.9, 1613.1, 1543.5, 1599.3, 1402.7, 1147.5, 1629, 1683.3, 1415.2, 1757,
                1497.5, 1575.2, 1718.8, 1628.4, 1446.6, 1679.7, 1456.2, 1336.6, 1714.3, 1771.7, 1662.6, 1742.2,
                1461.3, 1617.1, 1826.8, 1620.8, 1514.3, 1797.5, 1500.6, 1455.9, 1743.9, 1833, 1761.5, 1974.1,
                1671.8, 1841.5, 2126.9, 1716.3, 2005.8, 1840.8, 1733.4, 1451.7, 1957, 2127.9, 2094.3, 2157.1,
                2160.3, 1994.5, 2225.3, 2015.6, 2044.5, 2257.8, 1810.4, 1666.3, 2235.2, 2091.1, 2093.9, 1968.2,
                1962.3, 2095.2, 2161, 2115.1, 1929, 2004.5, 2009.9, 1524.9, 2061.1, 2261.6, 2103.6, 2224.3, 2173.8,
                2119.2, 2226.4, 2159.6, 1918.3, 2116.1, 1948.3, 1514.3, 2180.5, 2312.6, 2019.8, 2200.8, 2028.9,
                2178.7, 2433.7, 2230.5, 1884.2, 2372.7, 1918.6, 1679.4, 2327.3, 2225.2, 2211.7, 2463.6, 2029.5,
                2173.6, 2387, 2234, 2179.9, 2397, 1960.2, 1824.1, 2479.3, 2234.9, 2345.9, 2428.9, 2179.4, 2216.9,
                2642.3, 2340.5, 2474.6, 2641.8, 2165.1, 1996.2, 2562.9, 2529.9, 2549.6, 2455.1, 2472, 2424.7,
                2820.1, 2482.8, 2509.8, 2668.6, 2498.3, 2056.9, 2559.4, 2852.7, 2465.9, 2462.9, 2577, 2738.9,
                2771.8, 2954.7, 2525.3, 3163.9, 2720.1, 2233.5, 2972.4, 2941.8, 2171.7
            };

    public static final double[] M2
            = {
                1619.4, 1655, 1863.2, 1595.3, 1621.4, 1761.1, 1328.3, 1547.5, 1740.3, 1727, 1775.5, 1778.5, 1738.7,
                1798, 2045, 1808.6, 1809.8, 1897.7, 1605.2, 1730.8, 2013, 2061, 1765.6, 2083.2, 1961.4, 1960.6,
                2141.5, 1961.6, 1955.7, 2126.3, 1830.7, 1835.9, 2171.9, 2262.8, 2057.5, 2350.5, 1990.6, 2027.2,
                2204.9, 2020.3, 1906.4, 2034.8, 1802.9, 1724, 2078.3, 2020.4, 1907.6, 2055.7, 1707.6, 1801,
                2222.8, 1996.1, 1857, 2164.3, 1799.7, 1946.1, 2286.1, 2287.2, 2334, 2640.6, 2404.7, 2540.2, 2934.3,
                2533.3, 2689.8, 2596.7, 2321.7, 2746.6, 2867.8, 2881.4, 3194, 3146.5, 2912.9, 2924.3, 2935.6,
                3022.4, 2970.6, 2862.1, 2508, 2636.3, 2691.4, 2717.7, 2494.2, 2599.7, 2595.3, 2576, 2821.1,
                2807.3, 2725.4, 2617.5, 2521.4, 2463.2, 2808.6, 2993.2, 2605.6, 2856.4, 2861.5, 2809.3, 3092.4,
                2671.3, 2568.8, 2656.9, 2547.8, 2408.4, 2818.7, 2871.5, 2779.8, 3009.6, 2764, 2788.5, 3319.4,
                2998.2, 2841.2, 3233.5, 2889.3, 2910.5, 3259.3, 3419.9, 3311.8, 3644.9, 3208.3, 3400.6, 3969.6,
                3657.2, 3268.7, 3486.7, 3121.8, 3544.2, 3840.6, 3725.7, 4304.1, 4887.5, 4370, 4343.9, 5546,
                3953.4, 4115.5, 3964.8, 3651, 4032.1, 3862.5, 3993.1, 3963, 3962.3, 3910.2, 3685.9, 4055.5,
                3584.7, 4035.5, 4188.1, 4142.8, 4142.1, 4335.1, 4792.7, 4984.9, 5027.9, 5087.6, 4881.2, 5287.7,
                5299.5, 5075.3, 5779.7, 5245.9, 5103.1, 5285.6, 5221.1, 4348.7
            };

    public static final double[] M3
            = {
                1661.8, 1736.9, 2233.7, 1925, 1938.8, 2017.7, 1442.7, 1673.8, 1887.8, 1957.7, 1930.4, 1737.8,
                1815.1, 1888.1, 1950.6, 1806.2, 1746.8, 1778.2, 1502, 1541.1, 1876.6, 1979.7, 1777.5, 1716.7,
                1689.9, 1805.9, 2006.4, 2004.9, 1740, 2014.5, 1639.4, 1561, 2000.7, 1968.2, 1825.5, 1846.9,
                1714.8, 1936.7, 2194.8, 2105.3, 1949.7, 2150.1, 1864.1, 1873.6, 2107.7, 2077.4, 2007.4, 1975.8,
                1737, 1844.1, 2216.8, 1982, 1816.9, 2155.1, 1632.5, 1851, 2147.4, 2163.3, 2192, 2251.7, 2004.3,
                2429.2, 2641.8, 2203.7, 2504.1, 2280.4, 2054.3, 2185.2, 2406.8, 2437.7, 2606.2, 2350.6, 2386.5,
                2469.6, 2785.1, 2334.1, 2388.2, 2379.8, 2003.1, 2023.9, 2276.4, 2420.3, 2361.2, 2241.3, 2171.7,
                2293.9, 2493.7, 2382.5, 2286, 2391.8, 2163.6, 2095.9, 2442.1, 2611.2, 2498.6, 2342.2, 2326.8,
                2417.4, 2572.8, 2403.6, 2294.1, 2353.6, 2201.2, 1925.8, 2428.8, 2603.2, 2330.1, 2482.9, 2255.6,
                2518, 2960.7, 2571.5, 2348.4, 2817.9, 2166.6, 2284.7, 2864.3, 2738.3, 2734.9, 2893.3, 2503.3,
                2685.1, 3034.9, 2826.9, 2529.1, 2867.3, 2202.9, 2401.3, 2869.8, 2589, 2945.2, 2896.6, 2809.3,
                2926.4, 3634.7, 2772.1, 3023.5, 3022.9, 2565.5, 2797.5, 3101, 3092.9, 3140.5, 2751.5, 2947.4,
                3128.4, 3569, 2991.1, 3217.3, 3309.6, 2924.5, 2881.1, 3113.6, 3350.3, 3236.7, 3058.2, 3330,
                3437.9, 3536.9, 3707.8, 3316.2, 3697.6, 3199.1, 2929.6, 3468.5, 3620.7, 3065.6
            };

    public static final double[] PCRA = {
        16094.34042, 16368.12021, 15233.88966, 15370.77955, 15683.67074, 16407.23161, 16876.56839, 17424.12796,
        18206.35593, 19340.58648, 19555.69917, 19916.36579, 20482.17633, 21100.69323, 22038.76268/*,23006.35799,24479.42141
     ,26286.34352,28357.72638,30543.23084*/
    };

    public static final double[] IND_PCR = {
        103.29532, 102.75762, 101.91172, 102.58308, 103.07061, 102.87651, 104.22476, 95.163725, 95.500964,
        94.947974, 94.477737, 93.422194, 94.20844, 91.778527, 92.600797, 92.313678, 91.358591, 92.104858,
        90.402934, 91.4894, 90.6345, 92.098056, 91.939821, 92.283861, 92.091555, 91.701768, 92.288204,
        91.592825, 91.216143, 91.431754, 90.986469, 91.359825, 91.535054, 91.736206, 93.27483, 94.382133,
        95.025179, 97.090378, 96.715138, 98.10199, 99.148287, 99.172499, 100.04511, 99.498929, 99.061791,
        99.666563, 99.600238, 100.33003, 100.71723, 101.44431, 101.94025, 102.34955, 102.13386, 103.151,
        105.14168, 105.66517, 108.35956, 107.9938, 109.07239, 109.41624, 110.01066, 111.35785, 112.7508,
        114.25636, 115.12613, 116.84717, 116.93883, 119.16994, 121.01932, 123.56063, 125.66876, 128.84939,
        131.31864, 133.76343, 135.89239, 137.78569, 142.49302, 143.08843, 145.92117, 148.21557
    };

    public static final double[] NILE = new double[]{
        1120, 1160, 963, 1210, 1160, 1160, 813, 1230, 1370, 1140, 995, 935, 1110, 994, 1020, 960, 1180,
        799, 958, 1140, 1100, 1210, 1150, 1250, 1260, 1220, 1030, 1100, 774, 840, 874, 694, 940, 833,
        701, 916, 692, 1020, 1050, 969, 831, 726, 456, 824, 702, 1120, 1100, 832, 764, 821, 768, 845,
        864, 862, 698, 845, 744, 796, 1040, 759, 781, 865, 845, 944, 984, 897, 822, 1010, 771, 676,
        649, 846, 812, 742, 801, 1040, 860, 874, 848, 890, 744, 749, 838, 1050, 918, 986, 797, 923,
        975, 815, 1020, 906, 901, 1170, 912, 746, 919, 718, 714, 740};

    public static final double[] US_UNEMPL = new double[]{
        4.4, 3.77, 3.63, 3.27,
        5.47, 5.83, 6.4, 5.93,
        7.53, 5.63, 4.47, 3.67,
        4.13, 3.17, 3.07, 2.97,
        3.6, 3.03, 3.03, 2.47,
        3.17, 2.67, 2.57, 3.3,
        6.13, 5.83, 5.47, 4.77,
        5.57, 4.5, 3.77, 3.7,
        4.73, 4.33, 3.83, 3.67,
        4.63, 4.17, 3.83, 4.4,
        7.4, 7.4, 6.7, 5.7,
        6.8, 4.87, 4.9, 5.03,
        5.97, 5.27, 5.13, 5.67,
        7.83, 6.97, 6.3, 5.63,
        6.47, 5.5, 5.17, 5.03,
        6.6, 5.77, 5.2, 5.1,
        6.17, 5.07, 4.73, 4.53,
        5.43, 4.77, 4.17, 3.73,
        4.2, 3.97, 3.6, 3.37,
        4.1, 3.77, 3.83, 3.67,
        4, 3.53, 3.6, 3.2,
        3.63, 3.4, 3.67, 3.33,
        4.5, 4.67, 5.17, 5.4,
        6.5, 5.83, 5.97, 5.53,
        6.3, 5.6, 5.57, 4.9,
        5.43, 4.83, 4.8, 4.4,
        5.53, 5.07, 5.53, 6.13,
        9.07, 8.67, 8.33, 7.8,
        8.53, 7.37, 7.6, 7.33,
        8.23, 6.93, 6.8, 6.27,
        6.83, 5.83, 5.9, 5.53,
        6.2, 5.57, 5.77, 5.6,
        6.73, 7.13, 7.5, 7.03,
        7.97, 7.27, 7.27, 7.9,
        9.5, 9.37, 9.7, 10.27,
        11.17, 10, 9.13, 8.17,
        8.43, 7.4, 7.3, 6.97,
        7.77, 7.2, 7.07, 6.73
    };

    public static final double[] RETAIL_BOOKSTORES = {
        790, 540, 536, 524, 553, 589, 593, 895, 863, 647, 642, 1166, 999, 568, 602, 583, 613, 619, 608, 985, 905,
        669, 693, 1275, 1055, 636, 635, 610, 684, 726, 679, 1156, 1023, 733, 772, 1410, 1309, 720, 696, 689, 786,
        808, 783, 1248, 1103, 747, 851, 1468, 1375, 758, 743, 751, 855, 839, 787, 1361, 1042, 899, 908, 1600, 1559,
        825, 813, 806, 893, 876, 830, 1301, 1159, 926, 996, 1771, 1467, 923, 883, 854, 920, 939, 882, 1385, 1247, 954,
        991, 1849, 1514, 990, 976, 934, 977, 1032, 1024, 1388, 1242, 1020, 1090, 1998, 1506, 1091, 1031, 975, 1105, 1123,
        1049, 1595, 1407, 1015, 1100, 1895, 1586, 1070, 1063, 935, 1071, 1078, 1006, 1821, 1407, 1016, 1099, 1958, 1973,
        1001, 1009, 968, 1118, 1046, 1038, 1799, 1491, 998, 1060, 1949, 2056, 992, 926, 976, 1109, 1182, 1130, 2142, 1574,
        1047, 1037, 2065, 2148, 1108, 1073, 1023, 1112, 1206, 1172, 2119, 1560, 1069, 1088, 2199, 2075, 1086, 1101, 997,
        1120, 1154, 1214, 2219, 1553, 1064, 1150, 2256, 2225, 1101, 1092, 987, 1176, 1238, 1135, 2142, 1555, 1055, 1143,
        2134, 2222, 1040, 1029, 931, 1135, 1162, 1221, 2330, 1579, 1129, 1227, 2179, 2301, 1157, 1026, 1005, 1159, 1077,
        1124, 2435, 1481, 1032, 1044, 2029, 2214, 985, 961, 929, 1071, 1058, 1056, 2337, 1548, 975, 979, 1938, 2178, 962,
        962, 871, 1032, 1040, 1025, 2183, 1448, 949, 1030, 1982
    };
    public static final double[] RETAIL_BEERWINEANDLIQUORSTORES = {
        1519, 1551, 1606, 1686, 1834, 1786, 1924, 1874, 1781, 1894, 1843, 2527, 1623, 1539, 1688, 1725, 1807, 1804,
        1962, 1788, 1717, 1769, 1794, 2459, 1557, 1514, 1724, 1769, 1842, 1869, 1994, 1870, 1834, 1817, 1857, 2593,
        1565, 1510, 1736, 1709, 1818, 1873, 1898, 1872, 1856, 1800, 1892, 2616, 1690, 1662, 1849, 1810, 1970, 1971,
        2047, 2075, 1791, 1870, 2003, 2562, 1716, 1629, 1862, 1826, 2071, 2012, 2109, 2092, 1904, 2063, 2096, 2842,
        1859, 1780, 1906, 1976, 2153, 2072, 2222, 2130, 2041, 2174, 2166, 3054, 1877, 1818, 1998, 2111, 2224, 2159,
        2353, 2153, 2139, 2232, 2287, 3284, 1931, 1987, 2203, 2144, 2371, 2427, 2477, 2435, 2371, 2365, 2562, 3395,
        2121, 2063, 2340, 2244, 2484, 2540, 2496, 2532, 2329, 2423, 2652, 3559, 2125, 2121, 2379, 2312, 2583, 2500,
        2582, 2610, 2310, 2415, 2617, 3507, 2134, 2058, 2286, 2346, 2591, 2448, 2627, 2675, 2475, 2656, 2676, 3675,
        2306, 2231, 2411, 2567, 2701, 2659, 2884, 2637, 2633, 2743, 2779, 3824, 2232, 2329, 2545, 2655, 2725, 2799,
        2942, 2808, 2801, 2818, 2951, 4163, 2439, 2535, 2770, 2808, 3036, 3073, 3135, 3041, 3014, 2928, 3154, 4292,
        2581, 2615, 3019, 2879, 3275, 3379, 3337, 3308, 3072, 3104, 3316, 4427, 2695, 2828, 3014, 3024, 3452, 3313,
        3555, 3511, 3188, 3392, 3430, 4520, 2954, 2822, 3069, 3177, 3519, 3355, 3606, 3446, 3307, 3468, 3395, 4675,
        2900, 2943, 3258, 3376, 3511, 3484, 3723, 3523, 3446, 3577, 3608, 4772
    };

    public static final double[] RETAIL_FUELDEALERS = {
        1917, 1627, 1537, 1343, 1163, 1016, 969, 1005, 1152, 1433, 1532, 1975, 1893, 1884, 1902, 1300, 1099, 1058,
        1019, 1105, 1203, 1437, 1658, 2012, 2420, 2184, 1892, 1253, 1163, 1101, 1055, 1205, 1286, 1472,
        1633, 2040, 2152, 2185, 1877, 1440, 1398, 1210, 1123, 1258, 1317, 1476, 1882, 2506, 2865, 2570,
        2224, 1733, 1458, 1191, 1237, 1287, 1446, 1853, 2055, 2648, 3017, 2310, 1997, 1708, 1460, 1255,
        1272, 1353, 1452, 1753, 1921, 2448, 2326, 1997, 1984, 1516, 1283, 1210, 1177, 1140, 1270, 1484,
        1587, 1957, 2257, 1800, 2012, 1495, 1303, 1223, 1187, 1276, 1421, 1682, 1821, 2441, 2918, 2988,
        2289, 1741, 1703, 1593, 1470, 1724, 1963, 2253, 2460, 3597, 4101, 3113, 2806, 2003, 1660, 1460,
        1388, 1615, 1700, 1994, 1995, 2265, 2818, 2295, 2189, 1741, 1569, 1306, 1400, 1509, 1602, 2090,
        2324, 3145, 3842, 3505, 2995, 2040, 1636, 1469, 1565, 1677, 1812, 2263, 2193, 3394, 4050, 3461,
        2667, 2100, 1669, 1678, 1691, 1916, 2023, 2516, 2914, 3797, 4032, 3492, 3563, 2322, 2006, 1958,
        1867, 2310, 2597, 2801, 3137, 4390, 3866, 3834, 3804, 2526, 2435, 2295, 2134, 2500, 2384, 2950,
        3184, 3617, 4276, 4667, 3572, 2780, 2270, 1980, 1989, 2205, 2335, 2985, 3712, 4672, 5449, 4953,
        4474, 3473, 3047, 2785, 2865, 2733, 3096, 3612, 3397, 4088, 4742, 3852, 3355, 2358, 1936, 2015,
        1895, 1924, 2154, 2819, 3171, 4535, 5128, 4478, 3572, 2645, 2238, 2188, 2038, 2156, 2466, 2920, 3552, 5302
    };

    public static final double[] ABS_RETAIL = {
3396.4,3497.9,3357.8,3486.8,3355.9,3454.3,3551.5,3830.5,5179.7,3384.5,3369.8,3805.3,3665.1,3760,3630.8,
        3686.5,3816.3,3823.4,3878.7,4211.5,5684.3,3698.5,3733.2,4010.9,3788.4,4242.3,3872.1,3978,4096.1,
        3901.4,4274,4557.1,5847.5,4130,3856.8,4196.9,4228.9,4739.1,4190.3,4514.6,4566.3,4380.3,4857.7,
        5105,6628.2,4674.9,4294.1,4528,4729,5261.9,4637.8,4989.5,4923.8,4962.2,5305.1,5303.5,7340,5065.3,
        4679.8,4993,5166,5386.3,5118.9,5494.6,5236.7,5395.1,5744.4,5745,8022.4,5304.4,5226.8,5729.7,
        5527.3,5787.8,5739.2,5722.7,5787.3,5946.3,6065.8,6470.9,8885.8,5980.3,5574.1,6299,6075.7,6437.8,
        6377.4,6287.5,6436.4,6565.5,6605.4,7154.3,9394.4,6511.6,6031,6749.3,6476.1,6947.9,6758.9,6573.5,
        6911.2,6589.3,7002.9,7402.3,9414.4,6837.2,6284.6,6837.9,6709.5,7191.7,6674.9,7147,7262.7,6898.1,
        7624.4,7804.4,9813.7,7305.3,6848.2,7164.6,7435.5,7551.4,7180.7,7487,7119.3,7406,7946.1,7887,
        10379.6,7455.9,6833,7497.4,7539.8,7675.2,7507.9,7674.2,7361.4,7765.5,8063.3,8369.3,11130.8,
        7730.6,7295.2,8240.1,7775.5,8061.2,8057.1,8076.6,8222.7,8410.6,8638.4,8906.7,11684.1,8268.3,
        7750.3,8656.9,8514.5,8860.4,8767.9,8762.1,8964.4,8996.2,9214.9,9727.5,12525,9084.7,8632.1,9074.2,
        8946.5,9435.2,9003.1,9291.1,9386.1,8956.8,9675.6,9930.1,12523.5,9516.5,8636,9325,9221.1,9819.1,
        9116.7,9719.3,9524.8,9596.6,10237,10340.9,13318.2,10042.7,8872.4,9575.7,9756.6,10000.6,9556.1,
        10225.4,9835.4,10059.8,10773.4,10642.7,13837.5,10537.1,9430.1,10540,10390.7,10581,10264.8,10824.9,
        10555.3,10908.9,11336.8,11584,15016.9,10794.2,10114.8,10930.1,10609.9,11052.7,11675.2,10605.2,
        11190.6,11447.4,11664.4,12127.8,15567.3,11612.2,10625.2,11940.5,11576.8,12075.8,11749.3,12038.9,
        12204.9,11949.3,12797.9,13359,16743.5,12836,11392.4,12728.5,12455.8,13217.9,12550.6,12943.3,
        13261.7,12888.3,13798.9,14418.4,17801.4,13636.3,12067.5,13289.7,13347.9,13897.3,13284,14005.4,
        13933.3,14055.9,15188.7,15455,19384.4,14934.7,13588.5,14600.9,14552,14685.1,14679,15154.9,14731.7,
        15204.1,15769.1,16017.9,20298.1,15066.7,13693.5,15128.9,14742.6,15000.6,15159.8,15339.3,15299,
        15436,16002.8,16520.8,20955,15614.7,14231,15868.7,15619.2,15959,16106.6,16214.5,16401.9,16348.7,
        17155.7,17800.4,22142.8,16855.2,15331.4,17317.7,16514.4,17100.4,17184.1,17437,17801.5,17603.5,
        18530.4,19307.1,23833.7,18201,16791.4,17807.9,17543,18183.5,17477.9,18391.2,18198.2,17885.2,
        19144.5,19478.5,25184.3,19384.5,16853.8,18927.9,18849.3,19397.5,18902.9,19360.6,19156.7,19030.3,
        20294.6,20840.1,25958.5,19792,17431.5,19490.3,19032,19533.6,19339.1,20231.6,19860.8,19916.3,
        20575.4,21163.7,26599.2,20063.7,18079.3,19933.8,19833,19888.1,19738.3,20419.6,20388.3,20475.9,
        21183.4,21864.2,27425.4,20529.6,19071.2,20868.1,20028.9,20873.1,20878.1,20964.6,21352,21040.2,
        21850.4,22680.2,27676.4,21510.6,19299.8,21410.5,20601.1,21481,20984.5,21474.2,22024,21551.9,
        22853.7,23771.3,29137.6,22960.6,20295,22386.2,21975.8,22620.1,22061.3,22917.2,22898.2,23057.2,
        24332.7,24793.5,30425.9,23924.6,21239.9,23584.2,22812.9,23532.6,23293.5,24015.9,23824.2,24008.9,
        25447.3,25783.5,31923,24753.1,22734.9,24517.3,23975.9,24143.5,24165.3,24563.7,24591.3,25063.6,
        25974.6,26781.1,33100.2,25306.2,22615,25113.5,24583.1,25133.2,25167.5,25278.6,25275.4    
    };

    public static final double[] ABS_RETAIL2 = {
        3396.4,3497.9,3357.8,3486.8,3355.9,3454.3,3551.5,3830.5,5179.7,3384.5,3369.8,3805.3,3665.1,3760,
        3630.8,3686.5,3816.3,3823.4,3878.7,4211.5,5684.3,3698.5,3733.2,4010.9,3788.4,4242.3,3872.1,3978,
        4096.1,3901.4,4274,4557.1,5847.5,4130,3856.8,4196.9,4228.9,4739.1,4190.3,4514.6,4566.3,4380.3,
        4857.7,5105,6628.2,4674.9,4294.1,4528,4729,5261.9,4637.8,4989.5,4923.8,4962.2,5305.1,5303.5,7340,
        5065.3,4679.8,4993,5166,5386.3,5118.9,5494.6,5236.7,5395.1,5744.4,5745,8022.4,5304.4,5226.8,5729.7,
        5527.3,5787.8,5739.2,5722.7,5787.3,5946.3,6065.8,6470.9,8885.8,5980.3,5574.1,6299,6075.7,6437.8,6377.4,
        6287.5,6436.4,6565.5,6605.4,7154.3,9394.4,6511.6,6031,6749.3,6476.1,6947.9,6758.9,6573.5,6911.2,6589.3,
        7002.9,7402.3,9414.4,6837.2,6284.6,6837.9,6709.5,7191.7,6674.9,7147,7262.7,6898.1,7624.4,7804.4,9813.7,
        7305.3,6848.2,7164.6,7435.5,7551.4,7180.7,7487,7119.3,7406,7946.1,7887,10379.6,7455.9,6833,7497.4,7539.8,
        7675.2,7507.9,7674.2,7361.4,7765.5,8063.3,8369.3,11130.8,7730.6,7295.2,8240.1,7775.5,8061.2,8057.1,8076.6,
        8222.7,8410.6,8638.4,8906.7,11684.1,8268.3,7750.3,8656.9,8514.5,8860.4,8767.9,8762.1,8964.4,8996.2,9214.9,
        9727.5,12525,9084.7,8632.1,9074.2,8946.5,9435.2,9003.1,9291.1,9386.1,8956.8,9675.6,9930.1,12523.5,9516.5,
        8636,9325,9221.1,9819.1,9116.7,9719.3,9524.8,9596.6,10237,10340.9,13318.2,10042.7,8872.4,9575.7,9756.6,
        10000.6,9556.1,10225.4,9835.4,10059.8,10773.4,10642.7,13837.5,10537.1,9430.1,10540,10390.7,10581,10264.8,
        10824.9,10555.3,10908.9,11336.8,11584,15016.9,10794.2,10114.8,10930.1,10609.9,11052.7,11675.2,10605.2,
        11190.6,11447.4,11664.4,12127.8,15567.3,11612.2,10625.2,11940.5,11576.8,12075.8,11749.3,12038.9,12204.9,
        11949.3,12797.9,13359,16743.5,12836,11392.4,12728.5,12455.8,13217.9,12550.6,12943.3,13261.7,12888.3,13798.9,
        14418.4,17801.4,13636.3,12067.5,13289.7,13347.9,13897.3,13284,14005.4,13933.3,14055.9,15188.7,15455,
        19384.4,14934.7,13588.5,14600.9,14552,14685.1,14679,15154.9,14731.7,15204.1,15769.1,16017.9,20298.1,
        15066.7,13693.5,15128.9,14742.6,15000.6,15159.8,15339.3,15299,15436,16002.8,16520.8,20955,15614.7,14231,
        15868.7,15619.2,15959,16106.6,16214.5,16401.9,16348.7,17155.7,17800.4,22142.8,16855.2,15331.4,17317.7,
        16514.4,17100.4,17184.1,17437,17801.5,17603.5,18530.4,19307.1,23833.7,18201,16791.4,17807.9,17543,18183.5,
        17477.9,18391.2,18198.2,17885.2,19144.5,19478.5,25184.3,19384.5,16853.8,18927.9,18849.3,19397.5,18902.9,
        19360.6,19156.7,19030.3,20294.6,20840.1,25958.5,19792,17431.5,19490.3,19032,19533.6,19339.1,20231.6,19860.8,
        19916.3,20575.4,21163.7,26599.2,20063.7,18079.3,19933.8,19833,19888.1,19738.3,20419.6,20388.3,20475.9,
        21183.4,21864.2,27425.4,20529.6,19071.2,20868.1,20028.9,20873.1,20878.1,20964.6,21352,21040.2,21850.4,
        22680.2,27676.4,21510.6,19299.8,21410.5,20601.1,21481,20984.5,21474.2,22024,21551.9,22853.7,23771.3,
        29137.6,22960.6,20295,22386.2,21975.8,22620.1,22061.3,22917.2,22898.2,23057.2,24332.7,24793.5,30425.9,
        23924.6,21239.9,23584.2,22812.9,23532.6,23293.5,24015.9,23824.2,24008.9,25447.3,25783.5,31923,24753.1,
        22734.9,24517.3,23975.9,24143.5,24165.3,24563.7,24591.3,25063.6,25974.6,26781.1,33100.2,25306.2,22615,
        25113.5,24583.1,25133.2,25167.5,25278.6,25275.4
    };
    
    public static final TsData TS_PROD;
    public static final TsData DAILY_CONTINUOUS;
    public static final TsData TS_ABS_RETAIL, TS_ABS_RETAIL2;

    static {
        TS_PROD = TsData.of(TsPeriod.monthly(1967, 1), DoubleSequence.ofInternal(PROD));
        TS_ABS_RETAIL = TsData.of(TsPeriod.monthly(1982, 4), DoubleSequence.ofInternal(ABS_RETAIL));
        TS_ABS_RETAIL2 = TsData.of(TsPeriod.monthly(1982, 4), DoubleSequence.ofInternal(ABS_RETAIL2));
        DAILY_CONTINUOUS = TsData.of(TsPeriod.daily(2004, 1, 1), DoubleSequence.ofInternal(US_UNEMPL));
    }
}
