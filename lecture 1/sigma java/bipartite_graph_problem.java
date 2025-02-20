import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class bipartite_graph_problem {
    static class Edge2{
        int src;
        int dest;

        public Edge2(int s,int d){
            this.src = s;
            this.dest = d;
        }
    }
    static void createGraph(ArrayList<Edge2> graph[]) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }
//   printallpath problem
        graph[0].add(new Edge2(0,3));

        graph[2].add(new Edge2(2,3));

        graph[3].add(new Edge2(3,1));

        graph[4].add(new Edge2(4,0));
        graph[4].add(new Edge2(4,1));

        graph[5].add(new Edge2(5,0));
        graph[5].add(new Edge2(5,2));

//        // topological sorting bfs
//
//        graph[2].add(new Edge2(2,3));
//
//        graph[3].add(new Edge2(3,1));
//
//        graph[4].add(new Edge2(4,0));
//        graph[4].add(new Edge2(4,1));
//
//        graph[5].add(new Edge2(5,0));
//        graph[5].add(new Edge2(5,2));


//     topological sorting dfs
//        {
        graph[2].add(new Edge2(2, 3));

        graph[4].add(new Edge2(3, 1));

        graph[4].add(new Edge2(4, 0));
        graph[4].add(new Edge2(4, 1));

        graph[5].add(new Edge2(5, 0));
        graph[5].add(new Edge2(5, 2));
//    }


//   iscycle problem

//       graph[0].add(new Edge2(0, 2));
//
//        graph[1].add(new Edge2(1, 0));
//
//        graph[2].add(new Edge2(2, 3));
//
//        graph[3].add(new Edge2(3, 0));

    }

//    bipairatite problem

//    static void createGraph(ArrayList<Edge2> graph[]) {
//        for (int i = 0; i < graph.length; i++) {
//            graph[i] = new ArrayList<>();
//        }
//
//        graph[0].add(new Edge2(0, 1));
//        graph[0].add(new Edge2(0, 2));
//
//        graph[1].add(new Edge2(1, 0));
//        graph[1].add(new Edge2(1, 3));
//
//        graph[2].add(new Edge2(2, 0));
//        graph[2].add(new Edge2(2, 4));
//
//        graph[3].add(new Edge2(3, 1));
//        graph[3].add(new Edge2(3, 4));
//
//        graph[4].add(new Edge2(4, 2));
//        graph[4].add(new Edge2(4, 3));
//    }

    public static boolean isbipartite(ArrayList<Edge2>[]graph){
        int col[] = new int[graph.length];
        for (int i = 0; i < graph.length; i++) {
            col[i] = -1;
        }
        Queue<Integer> q = new LinkedList<>();

        for (int i = 0; i < graph.length; i++) {
            if (col[i] == -1){
                q.add(i);
               col[i] = 0; //yellow
                while (!q.isEmpty()){
                    int curr = q.remove();
                    for (int j = 0; j < graph[curr].size(); j++) {
                        Edge2 e = graph[curr].get(j);
                        if (col[e.dest] == -1){
                            int nextcol = col[curr] == 0 ? 1 : 0;
                            col[e.dest] = nextcol;
                            q.add(e.dest);
                        } else if (col[e.dest] == col[curr]) {
                            return false;
                        }
                    }
                }
            }
        }
        return true;
    }

    public static boolean iscycle(ArrayList<Edge2>[] graph){
        boolean vis[] = new boolean[graph.length];
        boolean stack[] = new boolean[graph.length];

        for (int i = 0; i < graph.length; i++) {
            if (!vis[i]){
                if (iscycleutill(graph,i,vis,stack)){
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean iscycleutill(ArrayList<Edge2>[] graph,int curr,boolean vis[],boolean stack[]){
        vis[curr] =  true;
        stack[curr] = true;

        for (int i = 0; i < graph[curr].size(); i++) {
            Edge2 e = graph[curr].get(i);
            if (stack[e.dest]){
                return true;
            }
            if (!vis[e.dest] && iscycleutill(graph,e.dest,vis,stack)){
                return true;
            }
        }
        stack[curr] = false;
        return false;
    }

    public static void topological_sorting_program_dfs(ArrayList<Edge2>[] graph){
        boolean vis[] = new boolean[graph.length];
        Stack<Integer> s = new Stack<>();

        for (int i = 0; i < graph.length; i++) {
            if (!vis[i]){
                topological_sorting_program_utill_dfs(graph,i,vis,s);
            }
        }
        while (!s.isEmpty()){
            System.out.println(s.pop()+" ");
        }
    }

    public static void topological_sorting_program_utill_dfs(ArrayList<Edge2>[]graph,int curr,boolean vis[],Stack<Integer>s){
        vis[curr] = true;

        for (int i = 0; i <graph[curr].size() ; i++) {
            Edge2 e = graph[curr].get(i);
            if (!vis[e.dest]){
                topological_sorting_program_utill_dfs(graph,e.dest,vis,s);
            }
        }
        s.push(curr);
    }
    public static void calcindeg(ArrayList<Edge2>graph[],int indeg[]){
        for (int i = 0; i < graph.length; i++) {
            int v = i;
            for (int j = 0; j < graph[v].size(); j++) {
                Edge2 e = graph[v].get(j);
                indeg[e.dest]++;
            }
        }
    }

    public static void topological_sorting_program_bfs(ArrayList<Edge2>graph[]){
        int indeg[] = new int[graph.length];
        calcindeg(graph,indeg);
        Queue<Integer> q = new LinkedList<>();

        for (int i = 0; i < graph.length; i++) {
            if (indeg[i] == 0){
                q.add(i);
            }
        }
        while (!q.isEmpty()){
            int curr = q.remove();
            System.out.print(curr+" ");

            for (int i = 0; i < graph[curr].size(); i++) {
                Edge2 e = graph[curr].get(i);
                indeg[e.dest]--;
                if (indeg[e.dest] == 0){
                    q.add(e.dest);
                }
            }
        }
        System.out.println();
    }

    public static void printallpath(ArrayList<Edge2>graph[],int src,int dest,String path){
        if (src == dest){
            System.out.println(path+dest);
            return;
        }
        for (int i = 0; i < graph[src].size(); i++) {
            Edge2 e = graph[src].get(i);
            printallpath(graph,e.dest,dest,path+src);
        }
    }
    public static void main(String[] args) {
//
//        int v = 5;
//        ArrayList<Edge2> graph[] = new ArrayList[v];
//        createGraph(graph);
//        System.out.println(isbipartite(graph));
//        // if graph doesnot have a cycle called bipartite graph

//        int v = 4;
//        ArrayList<Edge2> graph[] = new ArrayList[v];
//        createGraph(graph);
//        System.out.println(iscycle(graph));

//        int v = 6;
//        ArrayList<Edge2> graph[] = new ArrayList[v];
//        createGraph(graph);
//        topological_sorting_program_dfs(graph);

//        int v = 6;
//        ArrayList<Edge2>graph[] = new ArrayList[v];
//        createGraph(graph);
//        topological_sorting_program_bfs(graph);

        int v = 6;
        ArrayList<Edge2> graph[] = new ArrayList[v];
        createGraph(graph);
        int src = 5,dest = 1;
        printallpath(graph,5,1,"");

    }
}
