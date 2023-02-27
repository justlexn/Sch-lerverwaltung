public class Queue<ContentType> 
{ 
 
/* --------- Anfang der privaten inneren Klasse -------------- */ 
 
	private class QueueNode 
    { 
 
	private ContentType content = null; 
	private QueueNode nextNode = null; 
 
		public QueueNode(ContentType pContent) 
	    { 
		content = pContent; 
		nextNode = null; 
		} 
 
        public void setNext(QueueNode pNext) 
        { 
		nextNode = pNext; 
		} 
 
		public QueueNode getNext() 
        { 
		return nextNode; 
		} 
 
		public ContentType getContent() 
        { 
		return content; 
		} 
 
	} 
 
/* ----------- Ende der privaten inneren Klasse -------------- */ 
 
	private QueueNode head; 
	private QueueNode tail; 
 
	public Queue() 
	{ 
		head = null; 
		tail = null; 
	} 
 
	public boolean isEmpty() 
	{ 
		return head == null; 
	} 
 
	public void enqueue(ContentType pContent)
	{ 
		if (pContent != null) 
		{ 
			QueueNode newNode = new QueueNode(pContent); 
			if (this.isEmpty())
			{ 
				head = newNode; 
				tail = newNode; 
			} 
			else 
			{ 
				tail.setNext(newNode); 
				tail = newNode; 
			} 
		} 
	} 
	
	public void dequeue() 
	{ 
		if (!this.isEmpty()) 
		{ 
			head = head.getNext(); 
			if (this.isEmpty()) 
			{ 
				head = null; 
				tail = null; 
			} 
		} 
	} 
	public void removeLast()
	{
		int l = 0;
		if (!this.isEmpty()) 
		{ 
			ContentType pContent = null;
			while (pContent != front())
			{
				if(l==0)
					{
					pContent = front();
					}
				l++;
			}
			if (this.isEmpty()) 
			{ 
				head = null; 
				tail = null; 
			} 
		} 
	}
	public void removeContent(int p)
	{
		ContentType pContent= null;
		int l = 0;
		if(p == 1)
		{
			dequeue();
		}
		while (pContent != front())
		{
			if(l==0)
				{
				pContent = front();
				}
			l++;
			if(p == l)
			{
				dequeue();
			}
			enqueue(front());
			dequeue();
		}
	}
	public ContentType front() 
	{ 
		if (this.isEmpty()) 
		{ 
			return null; 
		}
		else 
		{ 
			return head.getContent(); 
		} 
	} 
	public int laenge()
	{
		ContentType pContent= null;
		int l = 0;
		if (isEmpty())
			{
			return l;
			}
		while (pContent != front())
		{
			if(l==0)
				{
				pContent = front();
				}
			l++;
			enqueue(front());
			dequeue();
		}
		return l;
		
	}
} 