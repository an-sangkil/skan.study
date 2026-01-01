    public static void main(String[] args) {

        BFSFindTheMaze bfsFindTheMaze = new BFSFindTheMaze();
        int dist = bfsFindTheMaze.soluction(new int[][]{{1,1,1},{1,0,1},{1,1,1},{1,0,1},{1,1,1}});
        System.out.println(dist);

    }
