// This file was generated by Mendix Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package main.proxies;

public class FaceDetail
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject faceDetailMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "Main.FaceDetail";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		Name("Name"),
		Confidence("Confidence"),
		DetailDetected("DetailDetected"),
		image_facedetails("Main.image_facedetails"),
		FaceDetail_Face("Main.FaceDetail_Face");

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

	public FaceDetail(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "Main.FaceDetail"));
	}

	protected FaceDetail(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject faceDetailMendixObject)
	{
		if (faceDetailMendixObject == null)
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		if (!com.mendix.core.Core.isSubClassOf("Main.FaceDetail", faceDetailMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a Main.FaceDetail");

		this.faceDetailMendixObject = faceDetailMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'FaceDetail.load(IContext, IMendixIdentifier)' instead.
	 */
	@Deprecated
	public static main.proxies.FaceDetail initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return main.proxies.FaceDetail.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static main.proxies.FaceDetail initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new main.proxies.FaceDetail(context, mendixObject);
	}

	public static main.proxies.FaceDetail load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return main.proxies.FaceDetail.initialize(context, mendixObject);
	}

	public static java.util.List<main.proxies.FaceDetail> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		java.util.List<main.proxies.FaceDetail> result = new java.util.ArrayList<main.proxies.FaceDetail>();
		for (com.mendix.systemwideinterfaces.core.IMendixObject obj : com.mendix.core.Core.retrieveXPathQuery(context, "//Main.FaceDetail" + xpathConstraint))
			result.add(main.proxies.FaceDetail.initialize(context, obj));
		return result;
	}

	/**
	 * Commit the changes made on this proxy object.
	 */
	public final void commit() throws com.mendix.core.CoreException
	{
		com.mendix.core.Core.commit(context, getMendixObject());
	}

	/**
	 * Commit the changes made on this proxy object using the specified context.
	 */
	public final void commit(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		com.mendix.core.Core.commit(context, getMendixObject());
	}

	/**
	 * Delete the object.
	 */
	public final void delete()
	{
		com.mendix.core.Core.delete(context, getMendixObject());
	}

	/**
	 * Delete the object using the specified context.
	 */
	public final void delete(com.mendix.systemwideinterfaces.core.IContext context)
	{
		com.mendix.core.Core.delete(context, getMendixObject());
	}
	/**
	 * @return value of Name
	 */
	public final java.lang.String getName()
	{
		return getName(getContext());
	}

	/**
	 * @param context
	 * @return value of Name
	 */
	public final java.lang.String getName(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Name.toString());
	}

	/**
	 * Set value of Name
	 * @param name
	 */
	public final void setName(java.lang.String name)
	{
		setName(getContext(), name);
	}

	/**
	 * Set value of Name
	 * @param context
	 * @param name
	 */
	public final void setName(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String name)
	{
		getMendixObject().setValue(context, MemberNames.Name.toString(), name);
	}

	/**
	 * @return value of Confidence
	 */
	public final java.math.BigDecimal getConfidence()
	{
		return getConfidence(getContext());
	}

	/**
	 * @param context
	 * @return value of Confidence
	 */
	public final java.math.BigDecimal getConfidence(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.math.BigDecimal) getMendixObject().getValue(context, MemberNames.Confidence.toString());
	}

	/**
	 * Set value of Confidence
	 * @param confidence
	 */
	public final void setConfidence(java.math.BigDecimal confidence)
	{
		setConfidence(getContext(), confidence);
	}

	/**
	 * Set value of Confidence
	 * @param context
	 * @param confidence
	 */
	public final void setConfidence(com.mendix.systemwideinterfaces.core.IContext context, java.math.BigDecimal confidence)
	{
		getMendixObject().setValue(context, MemberNames.Confidence.toString(), confidence);
	}

	/**
	 * @return value of DetailDetected
	 */
	public final java.lang.String getDetailDetected()
	{
		return getDetailDetected(getContext());
	}

	/**
	 * @param context
	 * @return value of DetailDetected
	 */
	public final java.lang.String getDetailDetected(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.DetailDetected.toString());
	}

	/**
	 * Set value of DetailDetected
	 * @param detaildetected
	 */
	public final void setDetailDetected(java.lang.String detaildetected)
	{
		setDetailDetected(getContext(), detaildetected);
	}

	/**
	 * Set value of DetailDetected
	 * @param context
	 * @param detaildetected
	 */
	public final void setDetailDetected(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String detaildetected)
	{
		getMendixObject().setValue(context, MemberNames.DetailDetected.toString(), detaildetected);
	}

	/**
	 * @return value of image_facedetails
	 */
	public final main.proxies.SlackImageRecognitionRequest getimage_facedetails() throws com.mendix.core.CoreException
	{
		return getimage_facedetails(getContext());
	}

	/**
	 * @param context
	 * @return value of image_facedetails
	 */
	public final main.proxies.SlackImageRecognitionRequest getimage_facedetails(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		main.proxies.SlackImageRecognitionRequest result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.image_facedetails.toString());
		if (identifier != null)
			result = main.proxies.SlackImageRecognitionRequest.load(context, identifier);
		return result;
	}

	/**
	 * Set value of image_facedetails
	 * @param image_facedetails
	 */
	public final void setimage_facedetails(main.proxies.SlackImageRecognitionRequest image_facedetails)
	{
		setimage_facedetails(getContext(), image_facedetails);
	}

	/**
	 * Set value of image_facedetails
	 * @param context
	 * @param image_facedetails
	 */
	public final void setimage_facedetails(com.mendix.systemwideinterfaces.core.IContext context, main.proxies.SlackImageRecognitionRequest image_facedetails)
	{
		if (image_facedetails == null)
			getMendixObject().setValue(context, MemberNames.image_facedetails.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.image_facedetails.toString(), image_facedetails.getMendixObject().getId());
	}

	/**
	 * @return value of FaceDetail_Face
	 */
	public final main.proxies.Face getFaceDetail_Face() throws com.mendix.core.CoreException
	{
		return getFaceDetail_Face(getContext());
	}

	/**
	 * @param context
	 * @return value of FaceDetail_Face
	 */
	public final main.proxies.Face getFaceDetail_Face(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		main.proxies.Face result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.FaceDetail_Face.toString());
		if (identifier != null)
			result = main.proxies.Face.load(context, identifier);
		return result;
	}

	/**
	 * Set value of FaceDetail_Face
	 * @param facedetail_face
	 */
	public final void setFaceDetail_Face(main.proxies.Face facedetail_face)
	{
		setFaceDetail_Face(getContext(), facedetail_face);
	}

	/**
	 * Set value of FaceDetail_Face
	 * @param context
	 * @param facedetail_face
	 */
	public final void setFaceDetail_Face(com.mendix.systemwideinterfaces.core.IContext context, main.proxies.Face facedetail_face)
	{
		if (facedetail_face == null)
			getMendixObject().setValue(context, MemberNames.FaceDetail_Face.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.FaceDetail_Face.toString(), facedetail_face.getMendixObject().getId());
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return faceDetailMendixObject;
	}

	/**
	 * @return the IContext instance of this proxy, or null if no IContext instance was specified at initialization.
	 */
	public final com.mendix.systemwideinterfaces.core.IContext getContext()
	{
		return context;
	}

	@Override
	public boolean equals(Object obj)
	{
		if (obj == this)
			return true;

		if (obj != null && getClass().equals(obj.getClass()))
		{
			final main.proxies.FaceDetail that = (main.proxies.FaceDetail) obj;
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
		return "Main.FaceDetail";
	}

	/**
	 * @return String GUID from this object, format: ID_0000000000
	 * @deprecated Use getMendixObject().getId().toLong() to get a unique identifier for this object.
	 */
	@Deprecated
	public java.lang.String getGUID()
	{
		return "ID_" + getMendixObject().getId().toLong();
	}
}
