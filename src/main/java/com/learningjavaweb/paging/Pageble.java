package com.learningjavaweb.paging;

import com.learningjavaweb.sort.Sorter;

public interface Pageble {
	Integer getPage();
	Integer getOffset();
	Integer getLimmit();
	Sorter getSorter();
}
