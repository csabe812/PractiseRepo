package job.interview;

public interface List {
	
	public Node find(Node element);
	
	public void add(Node element);
	
	public void delete(Node element);
	
	public String[] values();
	
}
