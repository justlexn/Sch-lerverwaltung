public class List<ContentType> { 
  /* --------- Anfang der privaten inneren Klasse -------------- */ 

  private class ListNode { 
    private ContentType contentObject; 
    private ListNode next; 
    private ListNode(ContentType pContent) { 
      contentObject = pContent; 
      next = null; 
    } 
    public ContentType getContentObject() { 
      return contentObject; 
    } 
    public void setContentObject(ContentType pContent) { 
      contentObject = pContent; 
    } 
    public ListNode getNextNode() { 

      return this.next; 

    } 
    public void setNextNode(ListNode pNext) { 
      this.next = pNext; 
    } 
  } 
  /* ----------- Ende der privaten inneren Klasse -------------- */ 
  // erstes Element der Liste 
  ListNode first; 
  // letztes Element der Liste 
  ListNode last; 
  // aktuelles Element der Liste 
  ListNode current; 
  public List() { 
    first = null; 
    last = null; 
    current = null; 
  } 
  public boolean isEmpty() { 
    // Die Liste ist leer, wenn es kein erstes Element gibt. 
    return first == null; 
  } 
  public boolean hasAccess() { 
    // Es gibt keinen Zugriff, wenn current auf kein Element verweist. 
    return current != null;  
  } 
  public void next() { 
    if (this.hasAccess()) { 
      current = current.getNextNode(); 
    } 
  } 
  public void toFirst() { 
    if (!isEmpty()) { 
      current = first; 
    } 
  } 
  public void toLast() { 
    if (!isEmpty()) { 
      current = last; 
    } 
  } 
  public ContentType getContent() { 
    if (this.hasAccess()) { 
      return current.getContentObject(); 
    } else { 
      return null; 
    } 
  } 
  public void setContent(ContentType pContent) { 
    // Nichts tun, wenn es keinen Inhalt oder kein aktuelles Element gibt. 
    if (pContent != null && this.hasAccess()) {  
      current.setContentObject(pContent); 
    } 
  } 
 
  public void insert(ContentType pContent) { 
    if (pContent != null) { // Nichts tun, wenn es keinen Inhalt gibt. 
      if (this.hasAccess()) { // Fall: Es gibt ein aktuelles Element. 
 
        // Neuen Knoten erstellen. 
        ListNode newNode = new ListNode(pContent);   
        if (current != first) { // Fall: Nicht an erster Stelle einfuegen. 
          ListNode previous = this.getPrevious(current); 
          newNode.setNextNode(previous.getNextNode()); 
          previous.setNextNode(newNode); 
        } else { // Fall: An erster Stelle einfuegen. 
          newNode.setNextNode(first); 
          first = newNode; 
        } 
 
      } else { //Fall: Es gibt kein aktuelles Element. 

        if (this.isEmpty()) { // Fall: In leere Liste einfuegen. 
          // Neuen Knoten erstellen. 
          ListNode newNode = new ListNode(pContent);  
          first = newNode; 
          last = newNode; 
        } 
      } 
    } 
  } 
  public void append(ContentType pContent) { 
    if (pContent != null) { // Nichts tun, wenn es keine Inhalt gibt. 
      if (this.isEmpty()) { // Fall: An leere Liste anfuegen. 
        this.insert(pContent); 
      } else { // Fall: An nicht-leere Liste anfuegen. 
 
        // Neuen Knoten erstellen. 
        ListNode newNode = new ListNode(pContent);  
        last.setNextNode(newNode); 
        last = newNode; // Letzten Knoten aktualisieren. 
      } 
    } 
  } 
  public void concat(List<ContentType> pList) { 
    if (pList != this && pList != null && !pList.isEmpty()) { // Nichts tun, 
    // wenn pList und this identisch, pList leer oder nicht existent. 
 
      if (this.isEmpty()) { // Fall: An leere Liste anfuegen. 
        this.first = pList.first; 
        this.last = pList.last; 
      } else { // Fall: An nicht-leere Liste anfuegen. 
        this.last.setNextNode(pList.first); 
        this.last = pList.last; 
      } 
 
      // Liste pList loeschen. 
      pList.first = null; 
      pList.last = null; 
      pList.current = null; 
    } 
  } 
  public void remove() { 
    // Nichts tun, wenn es kein aktuelle Element gibt oder die Liste leer ist. 
    if (this.hasAccess() && !this.isEmpty()) {  
 
      if (current == first) { 
        first = first.getNextNode(); 
      } else { 
        ListNode previous = this.getPrevious(current); 
        if (current == last) { 
          last = previous; 
        } 
        previous.setNextNode(current.getNextNode()); 
      } 
 
      ListNode temp = current.getNextNode(); 
      current.setContentObject(null); 
      current.setNextNode(null); 
      current = temp; 

      //Beim loeschen des letzten Elements last auf null setzen.  
      if (this.isEmpty()) { 
        last = null; 
      } 
    } 
  } 
  private ListNode getPrevious(ListNode pNode) { 
    if (pNode != null && pNode != first && !this.isEmpty()) { 
      ListNode temp = first; 
      while (temp != null && temp.getNextNode() != pNode) { 
        temp = temp.getNextNode(); 
      } 
      return temp; 
    } else { 
      return null; 
    } 
  } 
  public int laenge()
  {
	  int i =0;
	  ListNode zeiger = first;
	  while(zeiger != null)
	  {
		  zeiger = zeiger.getNextNode();
		  i++;
	  }
	  return i;
  }
} 