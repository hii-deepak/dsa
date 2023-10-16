class Trie {
    Node root;

    public Trie() {

        root = new Node('\0');
        
    }
    
    public void insert(String word) {
        Node curr = root;

        for(int i = 0; i<word.length(); i++){
            char c = word.charAt(i);
            if(curr.children[c-'a'] == null){
                curr.children[c-'a'] = new Node(word.charAt(i));
            }
            curr = curr.children[c-'a'];

        }
        curr.isWord = true;
    }
    
    public boolean search(String word) {
        Node get = getNode(word);
        return get != null && get.isWord == true;
    }
    
    public boolean startsWith(String prefix) {
        Node get = getNode(prefix);
        if(get != null)
        return true;
        else return false;
    }

    private Node getNode(String word){
        Node curr = root;

        for(int i = 0; i<word.length(); i++){
            char c = word.charAt(i);
            if(curr.children[c-'a'] == null)
            return null;

            curr = curr.children[c-'a'];
        }
        return curr;
    }

    class Node{
        char c ;
        Node[] children ;
        boolean isWord;
        Node(char c){
            this.c = c;
            children  = new Node[26];
            isWord = false;
        }
    }
}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */