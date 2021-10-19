package com.svn.high.level;

import java.io.File;

import org.tmatesoft.svn.core.SVNDepth;
import org.tmatesoft.svn.core.SVNException;
import org.tmatesoft.svn.core.SVNURL;
import org.tmatesoft.svn.core.auth.ISVNAuthenticationManager;
import org.tmatesoft.svn.core.wc.ISVNOptions;
import org.tmatesoft.svn.core.wc.SVNClientManager;
import org.tmatesoft.svn.core.wc.SVNRevision;
import org.tmatesoft.svn.core.wc.SVNUpdateClient;
import org.tmatesoft.svn.core.wc.SVNWCUtil;

/**
 * <pre>
 * Class Name  : SVNKitTest.java
 * Description : 
 * Modification Information
 * 
 *    수정일　　　 　　  수정자　　　     수정내용
 *    ────────────   ─────────   ───────────────────────────────
 *    2015. 1. 15.        ask               최초생성
 * </pre>
 *
 * @author ask
 * @since 2015. 1. 15.
 * @version
 *
 *          Copyright (C) 2014 by SKAN.COMPANY All right reserved.
 */
public class SVNKitTest {

	SVNClientManager ourClientManager;

	public boolean testConnect() throws Exception {

		return false;
	}

	private long checkout(SVNURL url, SVNRevision revision, File destPath, boolean isRecursive) throws SVNException {

		ISVNOptions options = SVNWCUtil.createDefaultOptions(true);
		ISVNAuthenticationManager authManager = SVNWCUtil.createDefaultAuthenticationManager("bockgily", "bockgily");
		ourClientManager = SVNClientManager.newInstance(options, authManager);

		SVNUpdateClient updateClient = ourClientManager.getUpdateClient();
		updateClient.setIgnoreExternals(false);

		// updateClient.doCheckout(url, new File("d:/test/checkout"), SVNRevision.HEAD, SVNRevision.HEAD, SVNDepth.FILES, false);
		long checkCount = updateClient.doCheckout(url, new File("d:/test/checkout"), SVNRevision.HEAD, SVNRevision.HEAD, SVNDepth.INFINITY, isRecursive);

		return checkCount;
	}

	public static void main(String[] args) throws SVNException {
		SVNKitTest svnKitTest = new SVNKitTest();
		SVNURL url = SVNURL.parseURIEncoded("https://192.168.10.231/svn/SOFOSCoding/SRC_WEB/trunk/com.softforum.sofos.coding.web");
		svnKitTest.checkout(url, SVNRevision.HEAD, new File("d:/test/checkout"), true);
	}
}
