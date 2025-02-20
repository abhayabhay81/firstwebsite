class Graph:
    def __init__(self,vno):
        self.vertex_count = vno
        self.adj_list = {v:[] for v in range(vno)}

    def add_edge(self,u,v,weight = 1):
        if 0 <= self.vertex_count and 0 <= v < self.vertex_count:
            self.adj_list[u].append((v,weight))
            self.adj_list[v].append((u,weight))
        else:
            print("invoid input")

    def remove_edge(self,u,v):
        if 0 <= self.vertex_count and 0 <= v < self.vertex_count:
            self.adj_list[u] = [(vertex,weight) for vertex,weight in self.adj_list[u] if vertex != v]
            self.adj_list[v] = [(vertex,weight) for vertex,weight in self.adj_list[v] if vertex != u]
        else:
            print("invlid input")

    def has_egde(self,u,v):
        if 0 <= self.vertex_count and 0 <= v < self.vertex_count:
            return any(vertex == v for vertex, x in self.adj_list[u])
        else:
            print("invalid vertex")
            return False
    def print_adj_list(self):
        for vertex, n in self.adj_list.items():
            print("v",vertex,":",n)

g = Graph(5)
g.add_edge(0,1)
g.add_edge(0,4)
g.add_edge(1,4)
g.add_edge(1,0)
g.add_edge(2,3)
g.print_adj_list()