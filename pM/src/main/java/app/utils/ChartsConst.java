package app.utils;

/**
 * Created by liuhaodong1 on 15/11/16.
 */
public class ChartsConst {

    //图1. 标题：今日单位时间PM2.5吸入量(毫克/30分钟).横轴为时间（今天0点到24点）；纵轴：单位时间(每30分钟)吸入的PM2.5量(毫克）
    //图2。标题：今日您所处环境的PM2.5浓度。横轴为时间（比如今天0点到24点）；纵轴：平均PM2.5暴露浓度。 (单位，微克/立方米)。 这里我们用每30分钟的平均浓度作图。
    //图3. 标题: 今日累积PM2.5吸入量(毫克).  横轴为时间（今天0点到24点）；纵轴：0点到该时刻累积吸入的PM2.5量(毫克）
    //图4。标题：近2小时您所处环境的PM2.5浓度。横轴为时间（0分到120分）；纵轴：平均PM2.5暴露浓度。 (单位，微克/立方米)。 这里我们用每5分钟的平均浓度作图。
    //图5. 标题：近两小时单位时间PM2.5吸入量(毫克/5分钟).横轴为时间（0分钟到120分钟）；纵轴：单位时间(每5分钟)吸入的PM2.5量(毫克）
    //图6。今天平均空气吸入量(升/分钟).   横轴为时间（今天0点到24点）；纵轴：平均单位时间吸入的空气量 (升/分钟)。  这里我们用每30分钟的平均值作图
    //图7. 标题: 过去7天PM2.5吸入量(毫克)。 为柱状图，横轴为各个柱对应的日期（比如7月30日，最后一个柱为“今日截止到此刻”）；纵轴：当天累计吸入的PM2.5量 (单位，毫克)
    //图8。近两小时平均空气吸入量(升/分钟).   横轴为时间（0分到120分）；纵轴：平均单位时间吸入的空气量 (升/分钟)。  这里我们用每5分钟的平均值作图
    //图10。标题：今天累积空气吸入量(升). 横轴为时间（今天0点到24点）；纵轴，今天到此时刻累计吸入的空气量 (升)
    //图12. 标题: 过去7天空气吸入量(升)。 为柱状图，横轴为各个柱对应的日期（比如7月30日，最后一个柱为“今日截止此刻”）；纵轴：当天累计吸入的空气吸入量 (升)
    public static String[] Chart_title = new String[]
            {
                    "",
                    "1.今日单位时间PM2.5吸入量(微克/30分钟)", "2.今日所处环境的PM2.5浓度(微克/立方米)",
                    "3.今日累积PM2.5吸入量(微克)", "4.近2小时所处环境的PM2.5浓度(微克/立方米)",
                    "5.近两小时单位时间PM2.5吸入量(微克/5分钟)", "6.今天平均空气吸入量(升/分钟)",
                    "7.过去7天PM2.5吸入量(微克)", "8.近两小时平均空气吸入量(升/分钟)",
                    "", "10.今天累积空气吸入量(升)",
                    "", "12.过去7天空气吸入量(升)"
            };

     public static String[] Chart_bottom = new String[]{
       "","今日时刻","今日时刻","今日时刻","近两个小时时刻(分钟)"
         ,"近两个小时时刻(分钟)","今日时刻","日期","近两个小时时刻(分钟)","",
             "今日时刻","","日期"
     };
    /**
     * -1 no chart, 0 column chart, 1 line chart*
     */
    public static int[] Chart_type = new int[]{
            -1,
            0, 1, 1, 1, 0,
            0, 0, 0, -1, 1,
            -1, 0

    };

    public static String[][] Chart_X = new String[][]{
            {
                    //0
            },
            { //1
                    "0", "0:30", "1", "1:30", "2", "2:30",
                    "3", "3:30", "4", "4:30", "5", "5:30",
                    "6", "6:30", "7", "7:30", "8", "8:30",
                    "9", "9:30", "10", "10:30", "11", "11:30",
                    "12", "12:30", "13", "13:30", "14", "14:30",
                    "15", "15:30", "16", "16:30", "17", "17:30",
                    "18", "18:30", "19", "19:30", "20", "20:30",
                    "21", "21:30", "22", "22:30", "23", "23:30"
            },
            { //2
                    "0", "0:30", "1", "1:30", "2", "2:30",
                    "3", "3:30", "4", "4:30", "5", "5:30",
                    "6", "6:30", "7", "7:30", "8", "8:30",
                    "9", "9:30", "10", "10:30", "11", "11:30",
                    "12", "12:30", "13", "13:30", "14", "14:30",
                    "15", "15:30", "16", "16:30", "17", "17:30",
                    "18", "18:30", "19", "19:30", "20", "20:30",
                    "21", "21:30", "22", "22:30", "23", "23:30"
            },
            {
                    //3
            },
            {
                    //4
                    "5", "10", "15", "20", "25", "30", "35", "40", "45", "50", "55", "60",
                    "65", "70", "75", "80", "85", "90", "95", "100", "105", "110", "115", "120"
            },
            {
                    //5
                    "5", "10", "15", "20", "25", "30", "35", "40", "45", "50", "55", "60",
                    "65", "70", "75", "80", "85", "90", "95", "100", "105", "110", "115", "120"
            },
            {
                    //6
                    "0", "0:30", "1", "1:30", "2", "2:30",
                    "3", "3:30", "4", "4:30", "5", "5:30",
                    "6", "6:30", "7", "7:30", "8", "8:30",
                    "9", "9:30", "10", "10:30", "11", "11:30",
                    "12", "12:30", "13", "13:30", "14", "14:30",
                    "15", "15:30", "16", "16:30", "17", "17:30",
                    "18", "18:30", "19", "19:30", "20", "20:30",
                    "21", "21:30", "22", "22:30", "23", "23:30"
            },
            {
                    //7
                    "1", "2", "3", "4", "5", "6", "7"
            },
            {
                    //8
                    "5", "10", "15", "20", "25", "30", "35", "40", "45", "50", "55", "60",
                    "65", "70", "75", "80", "85", "90", "95", "100", "105", "110", "115", "120"
            },
            {
                    //9
            },
            {
                    //10
            },
            {
                    //11
            },
            {
                    //12
                    "1", "2", "3", "4", "5", "6", "7"
            }

    };

}
