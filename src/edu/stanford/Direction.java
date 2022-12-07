package edu.stanford;

/**
 * @Auther: yuguo
 * @Date: 2022/1/5 - 01 - 05 - 19:38
 * @Description: edu.stanford
 * @version: 1.0
 */
public enum Direction {
    NORTH,EAST,SOUTH,WEST;

    public Direction trunLeft(){
        switch (this){
            case NORTH:return WEST;
            case EAST:return NORTH;
            case SOUTH:return EAST;
            case WEST:return SOUTH;
        }
        throw new RuntimeException("Illegal direction");
    }
    public Direction trunRight(){
        switch (this){
            case NORTH:return EAST;
            case EAST:return SOUTH;
            case SOUTH:return WEST;
            case WEST:return NORTH;
        }
        throw new RuntimeException("Illegal direction");
    }

    public static void main(String[] args) {
        for(Direction dir : Direction.values()){
            System.out.println(dir.trunLeft() + "<-" + dir + "->" + dir.trunRight());
        }
    }


}
