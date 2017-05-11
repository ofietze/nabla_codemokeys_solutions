{
    if(el == null || idx < 0 || idx > this.size() || this.contains(el)) return false;
    ListElement<T> fast=el, slow=el;

    while(slow != null && fast != null && fast.hasNext()) {
        fast = fast.next().next();
        slow = slow.next();
        if(fast == slow) return false;
    }
    
    for(ListElement<T> elIt = el; elIt != null; elIt = elIt.next()) {
        if(this.contains(elIt)) return false;
    }

    ListElement<T> tail = null, it = this.getFirst();

    int sizeCounter = 1;

    if(idx == 0) {
        tail = this.getFirst();
        this.setFirst(el);
        
        while(el.hasNext()) {
         el = el.next();
         sizeCounter++;
        } 
    }
    else 
    {
        for(int i = 0; i < idx - 1; i++) {
            it = it.next();
        }
        
        tail = it.next();
        it.setNext(el);

        while(el.hasNext()) {
            el = el.next();
            sizeCounter++;
        }
    }
    
    if(tail == null) {
        this.setLast(el);
    }
    else {
        el.setNext(tail);
    }
    this.setSize(this.size() + sizeCounter);
    return true;
}