// This file was generated by Mendix Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package main.proxies;

public class ImageReport extends system.proxies.FileDocument
{
	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "Main.ImageReport";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		HtmlReport("HtmlReport"),
		FileID("FileID"),
		Name("Name"),
		DeleteAfterDownload("DeleteAfterDownload"),
		Contents("Contents"),
		HasContents("HasContents"),
		SlackImageRecognitionRequest_ImageReport("Main.SlackImageRecognitionRequest_ImageReport");

		private java.lang.String metaName;

		MemberNames(java.lang.String s)
		{
			metaName = s;
		}

		@Override
		public java.lang.String toString()
		{
			return metaName;
		}
	}

	public ImageReport(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "Main.ImageReport"));
	}

	protected ImageReport(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject imageReportMendixObject)
	{
		super(context, imageReportMendixObject);
		if (!com.mendix.core.Core.isSubClassOf("Main.ImageReport", imageReportMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a Main.ImageReport");
	}

	/**
	 * @deprecated Use 'ImageReport.load(IContext, IMendixIdentifier)' instead.
	 */
	@Deprecated
	public static main.proxies.ImageReport initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return main.proxies.ImageReport.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static main.proxies.ImageReport initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new main.proxies.ImageReport(context, mendixObject);
	}

	public static main.proxies.ImageReport load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return main.proxies.ImageReport.initialize(context, mendixObject);
	}

	public static java.util.List<main.proxies.ImageReport> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		java.util.List<main.proxies.ImageReport> result = new java.util.ArrayList<main.proxies.ImageReport>();
		for (com.mendix.systemwideinterfaces.core.IMendixObject obj : com.mendix.core.Core.retrieveXPathQuery(context, "//Main.ImageReport" + xpathConstraint))
			result.add(main.proxies.ImageReport.initialize(context, obj));
		return result;
	}

	/**
	 * @return value of HtmlReport
	 */
	public final java.lang.String getHtmlReport()
	{
		return getHtmlReport(getContext());
	}

	/**
	 * @param context
	 * @return value of HtmlReport
	 */
	public final java.lang.String getHtmlReport(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.HtmlReport.toString());
	}

	/**
	 * Set value of HtmlReport
	 * @param htmlreport
	 */
	public final void setHtmlReport(java.lang.String htmlreport)
	{
		setHtmlReport(getContext(), htmlreport);
	}

	/**
	 * Set value of HtmlReport
	 * @param context
	 * @param htmlreport
	 */
	public final void setHtmlReport(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String htmlreport)
	{
		getMendixObject().setValue(context, MemberNames.HtmlReport.toString(), htmlreport);
	}

	/**
	 * @return value of SlackImageRecognitionRequest_ImageReport
	 */
	public final main.proxies.SlackImageRecognitionRequest getSlackImageRecognitionRequest_ImageReport() throws com.mendix.core.CoreException
	{
		return getSlackImageRecognitionRequest_ImageReport(getContext());
	}

	/**
	 * @param context
	 * @return value of SlackImageRecognitionRequest_ImageReport
	 */
	public final main.proxies.SlackImageRecognitionRequest getSlackImageRecognitionRequest_ImageReport(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		main.proxies.SlackImageRecognitionRequest result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.SlackImageRecognitionRequest_ImageReport.toString());
		if (identifier != null)
			result = main.proxies.SlackImageRecognitionRequest.load(context, identifier);
		return result;
	}

	/**
	 * Set value of SlackImageRecognitionRequest_ImageReport
	 * @param slackimagerecognitionrequest_imagereport
	 */
	public final void setSlackImageRecognitionRequest_ImageReport(main.proxies.SlackImageRecognitionRequest slackimagerecognitionrequest_imagereport)
	{
		setSlackImageRecognitionRequest_ImageReport(getContext(), slackimagerecognitionrequest_imagereport);
	}

	/**
	 * Set value of SlackImageRecognitionRequest_ImageReport
	 * @param context
	 * @param slackimagerecognitionrequest_imagereport
	 */
	public final void setSlackImageRecognitionRequest_ImageReport(com.mendix.systemwideinterfaces.core.IContext context, main.proxies.SlackImageRecognitionRequest slackimagerecognitionrequest_imagereport)
	{
		if (slackimagerecognitionrequest_imagereport == null)
			getMendixObject().setValue(context, MemberNames.SlackImageRecognitionRequest_ImageReport.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.SlackImageRecognitionRequest_ImageReport.toString(), slackimagerecognitionrequest_imagereport.getMendixObject().getId());
	}

	@Override
	public boolean equals(Object obj)
	{
		if (obj == this)
			return true;

		if (obj != null && getClass().equals(obj.getClass()))
		{
			final main.proxies.ImageReport that = (main.proxies.ImageReport) obj;
			return getMendixObject().equals(that.getMendixObject());
		}
		return false;
	}

	@Override
	public int hashCode()
	{
		return getMendixObject().hashCode();
	}

	/**
	 * @return String name of this class
	 */
	public static java.lang.String getType()
	{
		return "Main.ImageReport";
	}

	/**
	 * @return String GUID from this object, format: ID_0000000000
	 * @deprecated Use getMendixObject().getId().toLong() to get a unique identifier for this object.
	 */
	@Override
	@Deprecated
	public java.lang.String getGUID()
	{
		return "ID_" + getMendixObject().getId().toLong();
	}
}
