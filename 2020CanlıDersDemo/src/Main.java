
public class Main {

	public static void main(String[] args) {
		
		MDF mdf = new MDF ();
		Plywood  plywood = new Plywood ();
		
		
		
		BaseCustomer baseCustomer = new WorkplaceCustomer();
		baseCustomer.add((mdf.getBigMdfLong()*mdf.getBigMdfWide())+(plywood.SmallPlywoodLong*plywood.SmallPlywoodWide));
		

	}

}
