package Lec22;

import java.util.HashMap;

public class MyGraph {
	
	HashMap<Integer, HashMap<Integer,Integer>> gp;
	
	public MyGraph(int vtx)
	{
		gp = new HashMap<>();
		for(int i = 1;i <= vtx; i++)
		{
			gp.put(i, new HashMap<>());
		}
	}
	
	public void addVertex(int vtx)
	{
		gp.put(vtx, new HashMap<>());
	}
	
	public void addEdge(int u,int v,int cost)
	{
		gp.get(u).put(v, cost);
		gp.get(v).put(u, cost);
	}
	
	public boolean containsVertex(int vtx)
	{
		return gp.containsKey(vtx);
	}
	public boolean containsEdge(int u,int v)
	{
		return gp.get(u).containsKey(v);
	}
	public int getEdge(int u,int v)
	{
		return gp.get(u).get(v);
	}
	
	public void removeEdge(int u,int v)
	{
		gp.get(u).remove(v);
		gp.get(v).remove(u);
	}
	
	public void removeVertex(int vtx)
	{
		for(int u: gp.get(vtx).keySet())
		{
			gp.get(u).remove(vtx);
		}
		
		gp.remove(vtx);
	}
	
	public void display()
	{
		for(int u:gp.keySet())
		{
			System.out.println(u+" -> "+gp.get(u));
		}
	}
}
