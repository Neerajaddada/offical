package com.technoelevate.collections;

import java.util.Iterator;

public interface MyIterator extends Iterable {

	public Iterator iterator();

	public boolean hasNext();

	public Object next();

}
