
// interface (implemented with proposal)

interface SearchFrontEndInterface {    
    public void run(SearchBackEndInterface searchEngine);

}

// public class (implemented primarilly in final app week)

public class SearchFrontEnd implements SearchFrontEndInterface {

    @Override
    public void run(SearchBackEndInterface searchEngine) {
        // TODO Auto-generated method stub
        
    }

}

// placeholder(s) (implemented with proposal, and possibly added to later)
public class SearchFrontEndPlaceholder implements SearchFrontEndInterface {
	private SearchBackEndInterface searchBackEndPlaceholder;

	@Override
	public void run(SearchBackEndInterface searchEngine) {
		searchBackEndPlaceholder = searchEngine;
		System.out.println("This is where the JavaFX will start");
		
	}

}
