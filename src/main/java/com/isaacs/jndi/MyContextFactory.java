package com.isaacs.jndi;

import java.util.Hashtable;

import javax.naming.Binding;
import javax.naming.Context;
import javax.naming.Name;
import javax.naming.NameClassPair;
import javax.naming.NameParser;
import javax.naming.NamingEnumeration;
import javax.naming.NamingException;
import javax.naming.spi.InitialContextFactory;

public class MyContextFactory implements InitialContextFactory {

	public Context getInitialContext(Hashtable<?, ?> environment) throws NamingException {
		return new MyContext();
	}
	
}

class MyContext implements Context {

	public Object lookup(Name name) throws NamingException {
		return "stored value";
	}

	public Object lookup(String name) throws NamingException {
		return "stored value";
	}

	public Object addToEnvironment(String propName, Object propVal) throws NamingException {
		throw new IllegalStateException("Not implemented!");
	}

	public void bind(Name name, Object obj) throws NamingException {
		throw new IllegalStateException("Not implemented!");
	}

	public void bind(String name, Object obj) throws NamingException {
		throw new IllegalStateException("Not implemented!");
	}

	public void close() throws NamingException {
	}

	public Name composeName(Name name, Name prefix) throws NamingException {
		throw new IllegalStateException("Not implemented!");
	}

	public String composeName(String name, String prefix) throws NamingException {
		throw new IllegalStateException("Not implemented!");
	}

	public Context createSubcontext(Name name) throws NamingException {
		throw new IllegalStateException("Not implemented!");
	}

	public Context createSubcontext(String name) throws NamingException {
		throw new IllegalStateException("Not implemented!");
	}

	public void destroySubcontext(Name name) throws NamingException {
		throw new IllegalStateException("Not implemented!");
	}

	public void destroySubcontext(String name) throws NamingException {
		throw new IllegalStateException("Not implemented!");
	}

	public Hashtable<?, ?> getEnvironment() throws NamingException {
		throw new IllegalStateException("Not implemented!");
	}

	public String getNameInNamespace() throws NamingException {
		throw new IllegalStateException("Not implemented!");
	}

	public NameParser getNameParser(Name name) throws NamingException {
		throw new IllegalStateException("Not implemented!");
	}

	public NameParser getNameParser(String name) throws NamingException {
		throw new IllegalStateException("Not implemented!");
	}

	public NamingEnumeration<NameClassPair> list(Name name) throws NamingException {
		throw new IllegalStateException("Not implemented!");
	}

	public NamingEnumeration<NameClassPair> list(String name) throws NamingException {
		throw new IllegalStateException("Not implemented!");
	}

	public NamingEnumeration<Binding> listBindings(Name name) throws NamingException {
		throw new IllegalStateException("Not implemented!");
	}

	public NamingEnumeration<Binding> listBindings(String name) throws NamingException {
		throw new IllegalStateException("Not implemented!");
	}

	public Object lookupLink(Name name) throws NamingException {
		throw new IllegalStateException("Not implemented!");
	}

	public Object lookupLink(String name) throws NamingException {
		throw new IllegalStateException("Not implemented!");
	}

	public void rebind(Name name, Object obj) throws NamingException {
		throw new IllegalStateException("Not implemented!");
	}

	public void rebind(String name, Object obj) throws NamingException {
		throw new IllegalStateException("Not implemented!");
	}

	public Object removeFromEnvironment(String propName) throws NamingException {
		throw new IllegalStateException("Not implemented!");
	}

	public void rename(Name oldName, Name newName) throws NamingException {
		throw new IllegalStateException("Not implemented!");
	}

	public void rename(String oldName, String newName) throws NamingException {
		throw new IllegalStateException("Not implemented!");
	}

	public void unbind(Name name) throws NamingException {
		throw new IllegalStateException("Not implemented!");
	}

	public void unbind(String name) throws NamingException {
		throw new IllegalStateException("Not implemented!");
	}
}