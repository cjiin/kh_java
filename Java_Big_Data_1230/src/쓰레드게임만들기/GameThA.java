package 쓰레드게임만들기;

//쓰레드 생성, GameThA 는 전사 캐릭터에 대한 구현부
public class GameThA extends Thread {
    private Character warrior; //  외부에서 만들어진 객체를 주입받음. 클래스에 대한 참조변수를 만듦
    private Character wizard;

    public GameThA(Character warrior, Character wizard) {
        this.warrior = warrior; // 전사
        this.wizard = wizard; // 마법사
    }
    @Override
        public  void run() {
            int normal; // 일반 공격에 대한 확률 구하기
            int special; // 특수 공격에 대한 확률 구하기
            boolean endGame = false; // 게임에 대한 종료 여부
            while (true) {
                try {
                    sleep(3000); // 3초마다 반복
                    normal = (int)(Math.random() * 2); //50% 확률
                    special =(int)(Math.random() * 20); // 5%의 확률
                    if(normal == 1) {
                        System.out.println("물리 공격 : " + wizard.name + "에게 " + warrior.pAttack()+ " 데미지를 입혔습니다.");
                        endGame = wizard.setDamage(warrior.pAttack());
                    } else {
                        System.out.println("마법 공격 : " + wizard.name + "에게 " + warrior.mAttack()+ " 데미지를 입혔습니다.");
                        endGame = wizard.setDamage(warrior.mAttack());
                    }
                    if(special == 10) { // 1/20 즉, 5% 확률
                        System.out.println(warrior.name + " 궁극기 발동 !!!, " + wizard.name + "에게 " + warrior.ultimate() + " 데미지를 입혔습니다.");
                        endGame = wizard.setDamage(warrior.ultimate());
                    }
                    if(endGame) {
                        System.exit(0);
                    }
                }catch (InterruptedException e ) {}
            }
        }
    }
