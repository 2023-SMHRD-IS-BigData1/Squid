package controller;



	import java.util.ArrayList;
	import java.util.Random;
	import java.util.Scanner;

	import view.Main;

	public class gameController {
	   Scanner sc = new Scanner(System.in);
	   Random rd = new Random();
	   int index = 0;
	   Mp3 m = new Mp3();

	   public void ddak() throws InterruptedException {
	      while (true) {

	         int fail = 0; // 실패했을때 +1 씩 해줄 변수

	         while (true) {
	        	 Thread.sleep(2000);
	               System.out.println("▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀"
	                      + "\n                                                                "
	                      + "\n            집중을 해서 딱지를 치세요 >> g + enter              "
	                      + "\n                                                                \n"
	                      + "▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀ ");
	            String ddak = sc.next();
	            


	            int num = rd.nextInt(10) + 1;
	            System.out.println(" 당신의 파워 : " + num);

	            if (num > 2) {
	               System.out.println("SUCCESS\n\n\n\n");
	               m.fx(6);
	               Thread.sleep(1000);
	               System.out.println("                                =@%-                        \r\n"
		            		+ "                                @@@@#:                      \r\n"
		            		+ "                               ##+# *@%:                    \r\n"
		            		+ "                              :@. @: .*@*                   \r\n"
		            		+ "                              @*  @:   =#@-.                \r\n"
		            		+ "                             *%   -*     .@@=               \r\n"
		            		+ "                            .%=   :@       =@+-             \r\n"
		            		+ "                            :@    :@         #@@            \r\n"
		            		+ "                            @:     ##         .*@+          \r\n"
		            		+ "                           ##      ##           :@@:        \r\n"
		            		+ "                          :@-      .%.            =%%=      \r\n"
		            		+ "                          @=        @:              -@#     \r\n"
		            		+ "      @*@@@@@@@@@@@@@@@@@@@@@@*@    +-              =%@*    \r\n"
		            		+ "      @:                      :@    :@          ..@@%@@:    \r\n"
		            		+ "      @:               ==     :@    :@       +*@@*-- ##     \r\n"
		            		+ "      @:     .@@+.     ##     :@     #+ ..-@@%%:    :@      \r\n"
		            		+ "      @:    #@--+@+    ##     :@     #@*@@*-:       #=      \r\n"
		            		+ "      @:   #@:   +%    ##     :@ ::%@%@%           +@:      \r\n"
		            		+ "      @:   #:     @:   ##     :@#@@=:.@:          :@=       \r\n"
		            		+ "      @:  .%      #:   #@@@:  :@+     %:          =%        \r\n"
		            		+ "      @:   #+     @:   #%::   :@      -%          @:        \r\n"
		            		+ "      @:   +%    :@.   ##     :@      :@         ##         \r\n"
		            		+ "      @:    %%%%%@.    ##     :@       #.       :@.         \r\n"
		            		+ "      @:     =***.     ##     :@       ##       *#          \r\n"
		            		+ "      @:               #.     :@       ##      *@.          \r\n"
		            		+ "      @:     #@@@@@@@@@@@:    :@        @:    .%=           \r\n"
		            		+ "      @:       #%.   ##       :@        @:    :@            \r\n"
		            		+ "      @:       #%    ##       :@-       +*    @:            \r\n"
		            		+ "      @:       #%    ##       :@@@      :@   ##             \r\n"
		            		+ "      @:       #%    ##       :@.=@*-   .%  .%-             \r\n"
		            		+ "      @:     #@@@@@@@@@@@:    :@   #@-   ## %%              \r\n"
		            		+ "      @:     -===========.    :@    -%%+ ##=%.              \r\n"
		            		+ "      @:                      :@      :%@-%%*               \r\n"
		            		+ "      @:                      :@        +@@@                \r\n"
		            		+ "      @:                      :@          %:                \r\n"
		            		+ "      @:    h a n d m a d e   :@                            \r\n"
		            		+ "      @@@@@@@@@@@@@@@@@@@@@@@@@@                            \r\n"
		            		+ "      .:::::::::::::::::::::::::         ");
	               
	               break;
	            } else {
	               System.out.println("Fail...");
	               m.fx(5);
	               System.out.println("                                .@+:                          \r\n"
		               		+ "                              #=@@=                         \r\n"
		               		+ "                             :%.+ %@.                       \r\n"
		               		+ "                             #:.@  -**=                     \r\n"
		               		+ "                            *#  *    +@%                    \r\n"
		               		+ "                           :@-  *%    .=@+                  \r\n"
		               		+ "                           -@   .@       *@=                \r\n"
		               		+ "                           %.    @:       .#@-              \r\n"
		               		+ "                          %*     @=          @@             \r\n"
		               		+ "                         :@       =           +#+-          \r\n"
		               		+ "        #%%%%%%%%%%%%%%%%@@%%%:   @             *@:         \r\n"
		               		+ "        %#*:::::::::::::::::#@:   %          :-+@@:         \r\n"
		               		+ "        % #*               +@@:   +=      .%%@@:-#          \r\n"
		               		+ "        %  #+             =%.@:   =@  ::@%##   .%+          \r\n"
		               		+ "        %   #*           +@. @:    @##@=:.     -@           \r\n"
		               		+ "        %    %+         =@   @=:*@%@+          @.           \r\n"
		               		+ "        %     **       +@.   @@%-- -+         **            \r\n"
		               		+ "        %      %*     -@     @:     *         @             \r\n"
		               		+ "        %       **   =@.     @:     @.       +=             \r\n"
		               		+ "        %        %# -@       @:     =.      .@              \r\n"
		               		+ "        %         **%.       @:     =#      @+              \r\n"
		               		+ "        %         -@#        @:     :@     +@               \r\n"
		               		+ "        %        =%.**       @:      %-    #.               \r\n"
		               		+ "        %       =@   #%      @:      %*   .=                \r\n"
		               		+ "        %      =%     **     @@=.     *  .@:                \r\n"
		               		+ "        %     =@       *%    @--@#    @: *%                 \r\n"
		               		+ "        %    -%         **   @: .#@-  #::@                  \r\n"
		               		+ "        %   +@.          +%  @:   :@%.-:%=                  \r\n"
		               		+ "        %  =%             *# @:     -#@@#                   \r\n"
		               		+ "        % +%.              +#@:       +@:                   \r\n"
		               		+ "        %=%                 *@:                             \r\n"
		               		+ "        %@@@@@@@@@@@@@@@@@@@@@:                             \n\n\n\n");
	            }

	         }
	         break;
	      }
	   }

	   public void mugung() throws InterruptedException {
		   m.stp(5);
		   m.stp(6);
	      String arr[] = new String[3];
	      int cnt = 0;
	      arr[2] = "▣";

	      System.out.println("\n\n\n\n\n■■┃■■■┃■■■┃■■■┃■■■┃■■■┃■\r\n"
	               + "┻┻┻┻┻┻┻┻┻┻┻┻┻┻┻┻┻┻┻┻┻┻┻┻\r\n"
	             +  "음악이 나오는 동안 g를 눌러 전진/음악이 안나오는 동안 p를 눌러 멈추세요\n"
	               + "♪~ ♬ ♪♬~♪ ♪~ ♬ ♪♬~♪ ♪~ ♬ ♪♬~♪ ♪~ ♬ ♪");
	      loop: while (true) {
	         int num = rd.nextInt(5) + 1;

	         index = 1;
	         Thread.sleep(1000);

	         m.fx(1);

	         for (int k = 0; k <= num; k++) {

	            String click = sc.next();
	            if (m.isPlaying() == false) {
	               // 움직 NO
	               for (int i = 0; i < arr.length - 1; i++) {
	                  arr[i] = "□";
	               }
	               if (click.equals("g")) {
	            	   m.fx(7);
	            	   System.out.println("＿人人人人＿\r\n"
	                           + "＞ 게임오버!! ＜\r\n"
	                           + "ㅡY^Y^Y^Yㅡ");
	                  System.exit(0);

	               }

	            } else if (m.isPlaying() == true) {
	               // 움직YES

	               for (int i = 0; i < arr.length - 1; i++) {
	                  arr[i] = "□";
	               }

	               if (click.equals("g")) {

	                  arr[cnt] = "●";
	                  for (int i = 0; i < arr.length; i++) {
	                     System.out.print(arr[i]);
	                  }
	                  System.out.println();
	                  cnt++;

	               }
	               if (cnt == 2) {
	                  m.stp(1);
	                  System.out.println("성공!!!");

	                  break loop;
	               }

	            }
	         }

	         m.stp(1);
	         ;
	         Thread.sleep(5000);

	         String click = sc.next();

	         if (m.isPlaying() == false) {
	            // 움직 NO
	            for (int i = 0; i < arr.length - 1; i++) {
	               arr[i] = "□";
	            }
	            if (click.equals("g")) {

	            	System.out.println(".                              |\r\n"
	                        + "  　╲　　　　　　　　　　　╱\r\n"
	                        + "  　　　　　　　　　　/\r\n"
	                        + "  　　　╲　　　　　　　　╱\r\n"
	                        + "  　　╲　　    　　　　　╱\r\n"
	                        + "  -　-　　Game over　-　-\r\n"
	                        + "  　　╱　   　　　　　　╲\r\n"
	                        + "  　╱　　/                              .\r\n"
	                        + "  　　╱　　　　　　　　╲\r\n"
	                        + "  　　　　　/　|　　　\r\n"
	                        + "  　　　　　　　.\r\n"
	                        + "");
	                  System.out.println("게임오버!! 다시 실행하세요");
	               System.exit(0);
	            }
	         }
	      }
	   }
	   public void dal() {
	      while (true) {
	         ArrayList<String> dallist = new ArrayList<String>();

	         dallist.add("w");
	         dallist.add("w");
	         dallist.add("w");
	         dallist.add("w");
	         dallist.add("w");
	         dallist.add("d");
	         dallist.add("d");
	         dallist.add("d");
	         dallist.add("d");
	         dallist.add("d");
	         dallist.add("s");
	         dallist.add("s");
	         dallist.add("s");
	         dallist.add("s");
	         dallist.add("s");
	         dallist.add("a");
	         dallist.add("a");
	         dallist.add("a");
	         dallist.add("a");

	         int z = 0;

	         System.out.println("w(↑),a(←),s(↓),d(→) 방향키를 움직여서 한바퀴 완주하세요 (w 를 눌러 시작");
	         String input = sc.next();
	         m.fx(4);
	         if (input.equals(dallist.get(z))) {

	            if (z == 0) {
	               System.out.println(".........");
	               System.out.println(":┎─────┒:");
	               System.out.println(":┃/////┃:");
	               System.out.println(":┃/////┃:");
	               System.out.println("●┖─────┚:");
	               System.out.println("¨¨¨¨¨¨¨¨¨");
	            } else if (z == 1) {
	               System.out.println(".........");
	               System.out.println(":┎─────┒:");
	               System.out.println(":┃/////┃:");
	               System.out.println("●┃/////┃:");
	               System.out.println(" ┖─────┚:");
	               System.out.println("¨¨¨¨¨¨¨¨¨");
	            } else if (z == 2) {
	               System.out.println(".........");
	               System.out.println(":┎─────┒:");
	               System.out.println("●┃/////┃:");
	               System.out.println(" ┃/////┃:");
	               System.out.println(" ┖─────┚:");
	               System.out.println("¨¨¨¨¨¨¨¨¨");
	            } else if (z == 3) {
	               System.out.println(".........");
	               System.out.println("●┎─────┒:");
	               System.out.println(" ┃/////┃:");
	               System.out.println(" ┃/////┃:");
	               System.out.println(" ┖─────┚:");
	               System.out.println("¨¨¨¨¨¨¨¨¨");
	            } else if (z == 4) {
	               System.out.println("●........");
	               System.out.println(" ┎─────┒:");
	               System.out.println(" ┃/////┃:");
	               System.out.println(" ┃/////┃:");
	               System.out.println(" ┖─────┚:");
	               System.out.println("¨¨¨¨¨¨¨¨¨");
	            }else if (z == 5) {
	               System.out.println("  ●......");
	               System.out.println(" ┎─────┒:");
	               System.out.println(" ┃/////┃:");
	               System.out.println(" ┃/////┃:");
	               System.out.println(" ┖─────┚:");
	               System.out.println("¨¨¨¨¨¨¨¨¨");
	            } else if (z == 6) {
	               System.out.println("    ●....");
	               System.out.println(" ┎─────┒:");
	               System.out.println(" ┃/////┃:");
	               System.out.println(" ┃/////┃:");
	               System.out.println(" ┖─────┚:");
	               System.out.println("¨¨¨¨¨¨¨¨¨");
	            } else if (z == 7) {
	               System.out.println("     ●...");
	               System.out.println(" ┎─────┒:");
	               System.out.println(" ┃/////┃:");
	               System.out.println(" ┃/////┃:");
	               System.out.println(" ┖─────┚:");
	               System.out.println("¨¨¨¨¨¨¨¨¨");
	            } else if (z == 8) {
	               System.out.println("      ●..");
	               System.out.println(" ┎─────┒:");
	               System.out.println(" ┃/////┃:");
	               System.out.println(" ┃/////┃:");
	               System.out.println(" ┖─────┚:");
	               System.out.println("¨¨¨¨¨¨¨¨¨");
	            } else if (z == 9) {
	               System.out.println("        ●");
	               System.out.println(" ┎─────┒:");
	               System.out.println(" ┃/////┃:");
	               System.out.println(" ┃/////┃:");
	               System.out.println(" ┖─────┚:");
	               System.out.println("¨¨¨¨¨¨¨¨¨");
	            } else if (z == 10) {
	               System.out.println("         ");
	               System.out.println(" ┎─────┒●");
	               System.out.println(" ┃/////┃:");
	               System.out.println(" ┃/////┃:");
	               System.out.println(" ┖─────┚:");
	               System.out.println("¨¨¨¨¨¨¨¨¨");
	            } else if (z == 11) {
	               System.out.println("         ");
	               System.out.println(" ┎─────┒ ");
	               System.out.println(" ┃/////┃●");
	               System.out.println(" ┃/////┃:");
	               System.out.println(" ┖─────┚:");
	               System.out.println("¨¨¨¨¨¨¨¨¨");
	            } else if (z == 12) {
	               System.out.println("         ");
	               System.out.println(" ┎─────┒ ");
	               System.out.println(" ┃/////┃");
	               System.out.println(" ┃/////┃●");
	               System.out.println(" ┖─────┚:");
	               System.out.println("¨¨¨¨¨¨¨¨¨");
	            } else if (z == 13) {
	               System.out.println("         ");
	               System.out.println(" ┎─────┒ ");
	               System.out.println(" ┃/////┃ ");
	               System.out.println(" ┃/////┃ ");
	               System.out.println(" ┖─────┚●");
	               System.out.println("¨¨¨¨¨¨¨¨¨");
	            } else if (z == 14) {
	               System.out.println("         ");
	               System.out.println(" ┎─────┒ ");
	               System.out.println(" ┃/////┃ ");
	               System.out.println(" ┃/////┃ ");
	               System.out.println(" ┖─────┚ ");
	               System.out.println("¨¨¨¨¨¨¨¨●");
	               
	               
	            } else if (z == 15) {
	               System.out.println("         ");
	               System.out.println(" ┎─────┒ ");
	               System.out.println(" ┃/////┃ ");
	               System.out.println(" ┃/////┃ ");
	               System.out.println(" ┖─────┚ ");
	               System.out.println("¨¨¨¨¨¨●  ");

	            } else if (z == 16) {
	               System.out.println("         ");
	               System.out.println(" ┎─────┒ ");
	               System.out.println(" ┃/////┃ ");
	               System.out.println(" ┃/////┃ ");
	               System.out.println(" ┖─────┚ ");
	               System.out.println("¨¨¨¨●  ");


	            } else if (z == 17) {
	               System.out.println("         ");
	               System.out.println(" ┎─────┒ ");
	               System.out.println(" ┃/////┃ ");
	               System.out.println(" ┃/////┃ ");
	               System.out.println(" ┖─────┚ ");
	               System.out.println("¨¨●  ");

	            } else if (z == 18) {
	               System.out.println("         ");
	               System.out.println(" ┎─────┒ ");
	               System.out.println(" ┃/////┃ ");
	               System.out.println(" ┃/////┃ ");
	               System.out.println(" ┖─────┚ ");
	               System.out.println("●   ");
	               System.out.println("성공!");
	               break;

	            }

	         } else {
	            System.out.println("잘못입력 탈락");
	            System.exit(0);
	         }

	         z++;

	      }
	   }
	   public void jing() throws InterruptedException {
		   while (true) {
               int index2 = 2;
               int turn = 2;
               int life = 8;
               boolean[][] arr_bool = new boolean[3][2];
               String[][] arr_glass = new String[3][2];
               for (int i = 0; i < arr_bool.length; i++) {
                  arr_bool[i][0] = new Random().nextBoolean();
                  arr_bool[i][1] = !arr_bool[i][0];
                  for (int j = 0; j < arr_bool[i].length; j++) {
                     arr_glass[i][j] = "□";
                     // System.out.print(arr_bool[i][j]);
                  }
                  // System.out.println();
               }
               System.out.println("\n\n\n\n");
//               Thread.sleep(1000);
               System.out.println("▛▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▜");
               Thread.sleep(1000);System.out.println("▋                                                                                                         		   ▋");
               System.out.println("▋                   1.게임 시작                                2.게임 방법                                        						   ▋");
               Thread.sleep(1000);
               System.out.println("▙▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▟");
               int ch = sc.nextInt();
               Thread.sleep(500);
               System.out.println("_____\r\n"
                       + "  |__  /\r\n"
                       + "   /_ < \r\n"
                       + " ___/ / \r\n"
                       + "/____/  \r\n"
                       + "        ");
                 Thread.sleep(1000);
                 System.out.println(" ___   \r\n"
                       + "|__ \\  \r\n"
                       + "   ) | \r\n"
                       + "  / /  \r\n"
                       + " / /_  \r\n"
                       + "|____| \r\n"
                       + "       ");
                 Thread.sleep(1000);
                 System.out.println("       \r\n"
                       + " ___   \r\n"
                       + "|_  |  \r\n"
                       + " _| |_ \r\n"
                       + "|_____|\r\n"
                       + "       ");
               Thread.sleep(1000);
               System.out.println();
               System.out.println("\n❴시도 기회 : 17번❵ \n");
               System.out.println("   █████████                                       █████████  █████                       █████   \r\n"
                     + "  ███░░░░░███                                     ███░░░░░███░░███                       ░░███    \r\n"
                     + " ███     ░░░  ██████  █████████████    ██████    ░███    ░░░ ███████   ██████  ████████  ███████  \r\n"
                     + "░███         ░░░░░███░░███░░███░░███  ███░░███   ░░█████████░░░███░   ░░░░░███░░███░░███░░░███░   \r\n"
                     + "░███    █████ ███████ ░███ ░███ ░███ ░███████     ░░░░░░░░███ ░███     ███████ ░███ ░░░   ░███    \r\n"
                     + "░░███  ░░███ ███░░███ ░███ ░███ ░███ ░███░░░      ███    ░███ ░███ ██████░░███ ░███       ░███ ███\r\n"
                     + " ░░█████████░░█████████████░███ █████░░██████    ░░█████████  ░░█████░░█████████████      ░░█████ \r\n"
                     + "  ░░░░░░░░░  ░░░░░░░░░░░░░ ░░░ ░░░░░  ░░░░░░      ░░░░░░░░░    ░░░░░  ░░░░░░░░░░░░░        ░░░░░  \r\n"
                     + "                                                                                                  \r\n"
                     + "                                                                                                  \r\n"
                     + "                                                                                                  ");

				if (ch == 1) {
					while (true) {
						progress(arr_glass, turn);
						System.out.println(9 - life + "번째 도전!"); 
						System.out.println("당신의 선택은?\n1.왼쪽 2.오른쪽");
						int ch2 = sc.nextInt();
						if (ch2 == 1 || ch2 == 2) {
							try {
								System.out.println("점프중.....");
								Thread.sleep(2000);
							} catch (InterruptedException e) {
								e.printStackTrace();
							}
							if (arr_bool[index2][ch2 - 1] == true) {
								System.out.println("성공!");
								index2--;
								turn--;
							} else {
								System.out.println("사망!"
										+ "으아아아 ㅇㅏ\\r\\n\"\r\n"
										+ "		                              + \"　　　　　　 ㅇ\\r\\n\"\r\n"
										+ "		                              + \"　　　　　　　 ⋌\\r\\n\"\r\n"
										+ "		                              + \"　　　　　　　　　 ㅇ\\r\\n\"\r\n"
										+ "		                              + \"　 　　　　　　　　　 ㅜ\\r\\n\"\r\n"
										+ "		                              + \"　　　　　　　　　　　　 .\\r\\n\"\r\n"
										+ "		                              + \"　　　　　　　　　　　　　 .\\r\\n\"\r\n"
										+ "		                              + \"　　　　　　　　　　　　　　 .\\r\\n\"\r\n"
										+ "		                              + \"");
		                       
								arr_glass[index2][ch2 - 1] = " ";
								index2 = 2;
								turn = 2;
								life--;
							}

						} else
							System.out.println("올바른 숫자를 입력해주세요");
						if (life == 0) {
							System.out.println("게임 오버");
							break;
						}
						if (turn == -1) {
							System.out.println("\n\n\n\n");
						      System.out.println("\t\t\t\t██╗   ██╗ ██████╗ ██╗   ██╗    ██╗    ██╗██╗███╗   ██╗    ██╗██╗██╗██╗██╗██╗\r\n"
						            + "\t\t\t\t╚██╗ ██╔╝██╔═══██╗██║   ██║    ██║    ██║██║████╗  ██║    ██║██║██║██║██║██║\r\n"
						            + "\t\t\t\t ╚████╔╝ ██║   ██║██║   ██║    ██║ █╗ ██║██║██╔██╗ ██║    ██║██║██║██║██║██║\r\n"
						            + "\t\t\t\t  ╚██╔╝  ██║   ██║██║   ██║    ██║███╗██║██║██║╚██╗██║    ╚═╝╚═╝╚═╝╚═╝╚═╝╚═╝\r\n"
						            + "\t\t\t\t   ██║   ╚██████╔╝╚██████╔╝    ╚███╔███╔╝██║██║ ╚████║    ██╗██╗██╗██╗██╗██╗\r\n"
						            + "\t\t\t\t   ╚═╝    ╚═════╝  ╚═════╝      ╚══╝╚══╝ ╚═╝╚═╝  ╚═══╝    ╚═╝╚═╝╚═╝╚═╝╚═╝╚═╝\r\n"
						            + "\t\t\t\t                                                                           ");
						      System.out.println("\n\n\n\n");
						      System.out.println("\t\t\t\t⠀⠀⠀⠀⠀⠀⠀⠀⠀⣀⣀⣀⣀⣀⣀⣀⣀⣀⣀⣀⣀⣀⣀⣀⣀⣀⣀⣀⣀⣀⣀⣀⣀⣀⣀⣀⣀⣀⣀⣀⣀⣀⣀⣀⣀⣀⣀⣀⣀⣀⣀⣄⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
						            + "\t\t\t\t⠀⠀⠀⠀⠀⠀⠀⠀⠀⣿⡉⠉⠉⠉⠉⠉⠉⠉⠉⠉⠉⠉⠉⠉⠉⠉⠉⠉⠉⠉⠉⠉⠉⠉⠉⠉⠉⠉⠉⠉⠉⠉⠉⠉⠉⠉⠉⠉⠉⠉⢹⣿⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
						            + "\t\t\t\t⣶⣶⣶⣶⣶⣶⣶⣶⣶⣿⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⣿⣶⣦⣶⣶⣶⣶⣶⣤⣶\r\n"
						            + "\t\t\t\t⣿⡅⠀⣀⣀⣀⣀⣀⣁⣿⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣼⣇⣀⣄⣨⣁⣄⡄⠀⢸⡿\r\n"
						            + "\t\t\t\t⣿⡇⠀⢿⡟⠛⠛⠛⠛⢻⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣿⡟⠛⠛⠛⠛⣿⡇⠀⣾⡟\r\n"
						            + "\t\t\t\t⢹⣧⠀⢸⣧⠀⠀⠀⠀⠸⣿⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣿⠁⠀⠀⠀⠀⣿⠇⠀⣿⠇\r\n"
						            + "\t\t\t\t⠈⣿⡆⠀⣿⡄⠀⠀⠀⠀⣿⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⣿⠀⠀⠀⠀⢸⣿⠀⢸⡿⠨\r\n"
						            + "\t\t\t\t⠀⢹⣷⠀⢻⣧⠀⠀⠀⠀⢻⣧⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣾⠇⠀⠀⠀⢀⣾⠇⢠⣿⠃⠀\r\n"
						            + "\t\t\t\t⠀⠀⢻⣧⠈⢿⣦⠀⠀⠀⠸⣿⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⣿⠀⠀⠀⠀⣼⡟⠀⣾⡏⠀⠀\r\n"
						            + "\t\t\t\t⠀⠀⠈⢿⣇⠈⣿⣆⠀⠀⠀⢹⣧⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣿⡇⠀⠀⢀⣼⡟⢀⣾⠏⠀⠀⠀\r\n"
						            + "\t\t\t\t⠀⠀⠀⠀⢻⣧⡛⢻⣧⡀⠀⠈⣿⡄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣸⡟⠀⠀⢀⣾⠟⢠⣾⠟⠀⠀⠀⠀\r\n"
						            + "\t\t\t\t⠀⠀⠀⠀⠀⠹⣿⣤⠹⣿⣆⠀⠹⣷⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢠⣿⠁⢀⣴⡿⠃⣰⡿⠋⠀⠀⠀⠀⠀\r\n"
						            + "\t\t\t\t⠀⠀⠀⠀⠀⠀⠈⢿⣦⡈⠻⣷⣄⢻⣧⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢠⣾⢃⣴⡿⠋⣠⣾⡟⠁⠀⠀⠀⠀⠀⠀\r\n"
						            + "\t\t\t\t⠀⠀⠀⠀⠀⠀⠀⠀⠙⢿⣦⡈⠛⢿⣿⣧⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣾⣿⠿⠋⣠⣾⡿⠃⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
						            + "\t\t\t\t⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠙⠻⣷⣄⡈⢻⣧⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣾⠟⢁⣤⡾⠟⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
						            + "\t\t\t\t⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠙⢿⣶⣿⣧⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢠⣿⣯⣶⠟⠋⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
						            + "\t\t\t\t⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠙⠻⢿⣆⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣼⡿⠛⠉⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
						            + "\t\t\t\t⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠻⣷⣄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣠⡾⠏⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
						            + "\t\t\t\t⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠛⢿⣦⣀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣠⣶⡿⠋⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
						            + "\t\t\t\t⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠉⠻⠿⣶⣦⣄⣀⣀⠀⢀⣀⣀⣤⣴⣶⠿⠛⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
						            + "\t\t\t\t⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠉⢹⣿⠀⠈⣿⠉⠉⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
						            + "\t\t\t\t⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⣿⠀⠀⣿⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
						            + "\t\t\t\t⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⣿⠀⠀⣿⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
						            + "\t\t\t\t⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⣿⠀⠀⣿⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
						            + "\t\t\t\t⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢠⣴⣶⣶⣶⣾⣿⣶⣶⣿⣶⣶⣶⣶⣦⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
						            + "\t\t\t\t⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣀⣠⣤⣠⣿⣅⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣄⣹⣿⣤⣤⣄⣀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
						            + "\t\t\t\t⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣰⡾⠟⠉⠉⠉⠉⠉⠉⠉⠉⠉⠉⠉⠉⠉⠉⠉⠉⠉⠉⠉⠉⠉⠙⠻⣷⡄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
						            + "\t\t\t\t⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣴⣶⣶⣶⣿⣷⣶⣶⣶⣶⣶⣶⣶⣶⣶⣶⣶⣶⣶⣶⣶⣶⣶⣶⣶⣶⣶⣶⣶⣶⣾⣿⣶⣶⣶⣄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
						            + "\t\t\t\t⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣿⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀     ⢸⣿⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
						            + "\t\t\t\t⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣿⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀     ⠀⢸⣿⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
						            + "\t\t\t\t⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣿⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀     ⠀⠀⢸⣿⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
						            + "\t\t\t\t⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣿⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀     ⠀⢸⣿⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
						            + "\t\t\t\t⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢿⣧⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣼⡿⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
						            + "\t\t\t\t⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠉⢈⣈⣉⣉⣉⣉⣉⢉⢉⡉⡉⣉⢉⢉⢉⡉⡉⣉⢉⢉⢉⡉⡉⣉⢉⠉⡉⠉⠉⢉⠉⠉⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
						      System.out.println("\n\n\n\n");
						      System.out.println("██╗  ██╗███████╗    ██████╗  ██████╗  ██████╗     ██████╗  ██████╗  ██████╗     ██████╗  ██████╗  ██████╗ ██╗    ██╗ ██████╗ ███╗   ██╗\r\n"
						            + "██║  ██║██╔════╝   ██╔═████╗██╔═████╗██╔═████╗   ██╔═████╗██╔═████╗██╔═████╗   ██╔═████╗██╔═████╗██╔═████╗██║    ██║██╔═══██╗████╗  ██║\r\n"
						            + "███████║███████╗   ██║██╔██║██║██╔██║██║██╔██║   ██║██╔██║██║██╔██║██║██╔██║   ██║██╔██║██║██╔██║██║██╔██║██║ █╗ ██║██║   ██║██╔██╗ ██║\r\n"
						            + "╚════██║╚════██║   ████╔╝██║████╔╝██║████╔╝██║   ████╔╝██║████╔╝██║████╔╝██║   ████╔╝██║████╔╝██║████╔╝██║██║███╗██║██║   ██║██║╚██╗██║\r\n"
						            + "     ██║███████║▄█╗╚██████╔╝╚██████╔╝╚██████╔╝▄█╗╚██████╔╝╚██████╔╝╚██████╔╝▄█╗╚██████╔╝╚██████╔╝╚██████╔╝╚███╔███╔╝╚██████╔╝██║ ╚████║\r\n"
						            + "     ╚═╝╚══════╝╚═╝ ╚═════╝  ╚═════╝  ╚═════╝ ╚═╝ ╚═════╝  ╚═════╝  ╚═════╝ ╚═╝ ╚═════╝  ╚═════╝  ╚═════╝  ╚══╝╚══╝  ╚═════╝ ╚═╝  ╚═══╝\r\n"
						            + "                                                                                                                                       ");
							System.exit(0);
						}
					}
				} else if (ch == 2)
					System.out.println("오징어게임 보고 오세요");
				else {
					System.out.println("올바른 숫자를 입력해주세요");
				}
			}

	      }
		public static void progress(String[][] arr_glass2, int turn2) {
			for (int i = 0; i < arr_glass2.length; i++) {
				System.out.print("│");
				for (int j = 0; j < arr_glass2[i].length; j++) {
					System.out.print("   " + arr_glass2[i][j] + "   ");
				}
				System.out.print("│");
				if (i == turn2 + 1)
					System.out.println("<-------현위치");
				else
					System.out.println();
			}
		}
	   
	}

