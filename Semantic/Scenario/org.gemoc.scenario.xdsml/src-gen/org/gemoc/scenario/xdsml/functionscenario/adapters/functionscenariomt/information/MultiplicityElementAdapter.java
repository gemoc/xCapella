package org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.information;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import java.util.Collection;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.FunctionScenarioMTAdaptersFactory;
import org.polarsys.capella.core.data.information.MultiplicityElement;

@SuppressWarnings("all")
public class MultiplicityElementAdapter extends EObjectAdapter<MultiplicityElement> implements org.gemoc.scenario.xdsml.functionscenariomt.information.MultiplicityElement {
  private FunctionScenarioMTAdaptersFactory adaptersFactory;
  
  public MultiplicityElementAdapter() {
    super(org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.FunctionScenarioMTAdaptersFactory.getInstance());
    adaptersFactory = org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.FunctionScenarioMTAdaptersFactory.getInstance();
  }
  
  @Override
  public String getId() {
    return adaptee.getId();
  }
  
  @Override
  public void setId(final String o) {
    adaptee.setId(o);
  }
  
  @Override
  public String getSid() {
    return adaptee.getSid();
  }
  
  @Override
  public void setSid(final String o) {
    adaptee.setSid(o);
  }
  
  @Override
  public boolean isVisibleInDoc() {
    return adaptee.isVisibleInDoc();
  }
  
  @Override
  public void setVisibleInDoc(final boolean o) {
    adaptee.setVisibleInDoc(o);
  }
  
  @Override
  public boolean isVisibleInLM() {
    return adaptee.isVisibleInLM();
  }
  
  @Override
  public void setVisibleInLM(final boolean o) {
    adaptee.setVisibleInLM(o);
  }
  
  @Override
  public String getSummary() {
    return adaptee.getSummary();
  }
  
  @Override
  public void setSummary(final String o) {
    adaptee.setSummary(o);
  }
  
  @Override
  public String getDescription() {
    return adaptee.getDescription();
  }
  
  @Override
  public void setDescription(final String o) {
    adaptee.setDescription(o);
  }
  
  @Override
  public String getReview() {
    return adaptee.getReview();
  }
  
  @Override
  public void setReview(final String o) {
    adaptee.setReview(o);
  }
  
  @Override
  public boolean isOrdered() {
    return adaptee.isOrdered();
  }
  
  @Override
  public void setOrdered(final boolean o) {
    adaptee.setOrdered(o);
  }
  
  @Override
  public boolean isUnique() {
    return adaptee.isUnique();
  }
  
  @Override
  public void setUnique(final boolean o) {
    adaptee.setUnique(o);
  }
  
  @Override
  public boolean isMinInclusive() {
    return adaptee.isMinInclusive();
  }
  
  @Override
  public void setMinInclusive(final boolean o) {
    adaptee.setMinInclusive(o);
  }
  
  @Override
  public boolean isMaxInclusive() {
    return adaptee.isMaxInclusive();
  }
  
  @Override
  public void setMaxInclusive(final boolean o) {
    adaptee.setMaxInclusive(o);
  }
  
  private /* EList<org.gemoc.scenario.xdsml.functionscenariomt.emde.ElementExtension> */Object ownedExtensions_;
  
  @Override
  public /* EList<org.gemoc.scenario.xdsml.functionscenariomt.emde.ElementExtension> */Object getOwnedExtensions() {
    if (ownedExtensions_ == null)
    	ownedExtensions_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getOwnedExtensions(), adaptersFactory, eResource);
    return ownedExtensions_;
  }
  
  private /* EList<org.gemoc.scenario.xdsml.functionscenariomt.modellingcore.AbstractConstraint> */Object constraints_;
  
  @Override
  public /* EList<org.gemoc.scenario.xdsml.functionscenariomt.modellingcore.AbstractConstraint> */Object getConstraints() {
    if (constraints_ == null)
    	constraints_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getConstraints(), adaptersFactory, eResource);
    return constraints_;
  }
  
  private /* EList<org.gemoc.scenario.xdsml.functionscenariomt.modellingcore.AbstractConstraint> */Object ownedConstraints_;
  
  @Override
  public /* EList<org.gemoc.scenario.xdsml.functionscenariomt.modellingcore.AbstractConstraint> */Object getOwnedConstraints() {
    if (ownedConstraints_ == null)
    	ownedConstraints_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getOwnedConstraints(), adaptersFactory, eResource);
    return ownedConstraints_;
  }
  
  private /* EList<org.gemoc.scenario.xdsml.functionscenariomt.modellingcore.AbstractTrace> */Object incomingTraces_;
  
  @Override
  public /* EList<org.gemoc.scenario.xdsml.functionscenariomt.modellingcore.AbstractTrace> */Object getIncomingTraces() {
    if (incomingTraces_ == null)
    	incomingTraces_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getIncomingTraces(), adaptersFactory, eResource);
    return incomingTraces_;
  }
  
  private /* EList<org.gemoc.scenario.xdsml.functionscenariomt.modellingcore.AbstractTrace> */Object outgoingTraces_;
  
  @Override
  public /* EList<org.gemoc.scenario.xdsml.functionscenariomt.modellingcore.AbstractTrace> */Object getOutgoingTraces() {
    if (outgoingTraces_ == null)
    	outgoingTraces_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getOutgoingTraces(), adaptersFactory, eResource);
    return outgoingTraces_;
  }
  
  private /* EList<org.gemoc.scenario.xdsml.functionscenariomt.capellacore.AbstractPropertyValue> */Object ownedPropertyValues_;
  
  @Override
  public /* EList<org.gemoc.scenario.xdsml.functionscenariomt.capellacore.AbstractPropertyValue> */Object getOwnedPropertyValues() {
    if (ownedPropertyValues_ == null)
    	ownedPropertyValues_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getOwnedPropertyValues(), adaptersFactory, eResource);
    return ownedPropertyValues_;
  }
  
  private /* EList<org.gemoc.scenario.xdsml.functionscenariomt.capellacore.EnumerationPropertyType> */Object ownedEnumerationPropertyTypes_;
  
  @Override
  public /* EList<org.gemoc.scenario.xdsml.functionscenariomt.capellacore.EnumerationPropertyType> */Object getOwnedEnumerationPropertyTypes() {
    if (ownedEnumerationPropertyTypes_ == null)
    	ownedEnumerationPropertyTypes_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getOwnedEnumerationPropertyTypes(), adaptersFactory, eResource);
    return ownedEnumerationPropertyTypes_;
  }
  
  private /* EList<org.gemoc.scenario.xdsml.functionscenariomt.capellacore.AbstractPropertyValue> */Object appliedPropertyValues_;
  
  @Override
  public /* EList<org.gemoc.scenario.xdsml.functionscenariomt.capellacore.AbstractPropertyValue> */Object getAppliedPropertyValues() {
    if (appliedPropertyValues_ == null)
    	appliedPropertyValues_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getAppliedPropertyValues(), adaptersFactory, eResource);
    return appliedPropertyValues_;
  }
  
  private /* EList<org.gemoc.scenario.xdsml.functionscenariomt.capellacore.PropertyValueGroup> */Object ownedPropertyValueGroups_;
  
  @Override
  public /* EList<org.gemoc.scenario.xdsml.functionscenariomt.capellacore.PropertyValueGroup> */Object getOwnedPropertyValueGroups() {
    if (ownedPropertyValueGroups_ == null)
    	ownedPropertyValueGroups_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getOwnedPropertyValueGroups(), adaptersFactory, eResource);
    return ownedPropertyValueGroups_;
  }
  
  private /* EList<org.gemoc.scenario.xdsml.functionscenariomt.capellacore.PropertyValueGroup> */Object appliedPropertyValueGroups_;
  
  @Override
  public /* EList<org.gemoc.scenario.xdsml.functionscenariomt.capellacore.PropertyValueGroup> */Object getAppliedPropertyValueGroups() {
    if (appliedPropertyValueGroups_ == null)
    	appliedPropertyValueGroups_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getAppliedPropertyValueGroups(), adaptersFactory, eResource);
    return appliedPropertyValueGroups_;
  }
  
  @Override
  public org.gemoc.scenario.xdsml.functionscenariomt.capellacore.EnumerationPropertyLiteral getStatus() {
    return () adaptersFactory.createAdapter(adaptee.getStatus(), eResource);
  }
  
  @Override
  public void setStatus(final org.gemoc.scenario.xdsml.functionscenariomt.capellacore.EnumerationPropertyLiteral o) {
    if (o != null)
    	adaptee.setStatus(((org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.capellacore.EnumerationPropertyLiteralAdapter) o).getAdaptee());
    else adaptee.setStatus(null);
  }
  
  private /* EList<org.gemoc.scenario.xdsml.functionscenariomt.capellacore.EnumerationPropertyLiteral> */Object features_;
  
  @Override
  public /* EList<org.gemoc.scenario.xdsml.functionscenariomt.capellacore.EnumerationPropertyLiteral> */Object getFeatures() {
    if (features_ == null)
    	features_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getFeatures(), adaptersFactory, eResource);
    return features_;
  }
  
  private /* EList<org.gemoc.scenario.xdsml.functionscenariomt.requirement.Requirement> */Object appliedRequirements_;
  
  @Override
  public /* EList<org.gemoc.scenario.xdsml.functionscenariomt.requirement.Requirement> */Object getAppliedRequirements() {
    if (appliedRequirements_ == null)
    	appliedRequirements_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getAppliedRequirements(), adaptersFactory, eResource);
    return appliedRequirements_;
  }
  
  @Override
  public org.gemoc.scenario.xdsml.functionscenariomt.information.datavalue.DataValue getOwnedDefaultValue() {
    return () adaptersFactory.createAdapter(adaptee.getOwnedDefaultValue(), eResource);
  }
  
  @Override
  public void setOwnedDefaultValue(final org.gemoc.scenario.xdsml.functionscenariomt.information.datavalue.DataValue o) {
    if (o != null)
    	adaptee.setOwnedDefaultValue(((org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.information.datavalue.DataValueAdapter) o).getAdaptee());
    else adaptee.setOwnedDefaultValue(null);
  }
  
  @Override
  public org.gemoc.scenario.xdsml.functionscenariomt.information.datavalue.DataValue getOwnedMinValue() {
    return () adaptersFactory.createAdapter(adaptee.getOwnedMinValue(), eResource);
  }
  
  @Override
  public void setOwnedMinValue(final org.gemoc.scenario.xdsml.functionscenariomt.information.datavalue.DataValue o) {
    if (o != null)
    	adaptee.setOwnedMinValue(((org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.information.datavalue.DataValueAdapter) o).getAdaptee());
    else adaptee.setOwnedMinValue(null);
  }
  
  @Override
  public org.gemoc.scenario.xdsml.functionscenariomt.information.datavalue.DataValue getOwnedMaxValue() {
    return () adaptersFactory.createAdapter(adaptee.getOwnedMaxValue(), eResource);
  }
  
  @Override
  public void setOwnedMaxValue(final org.gemoc.scenario.xdsml.functionscenariomt.information.datavalue.DataValue o) {
    if (o != null)
    	adaptee.setOwnedMaxValue(((org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.information.datavalue.DataValueAdapter) o).getAdaptee());
    else adaptee.setOwnedMaxValue(null);
  }
  
  @Override
  public org.gemoc.scenario.xdsml.functionscenariomt.information.datavalue.DataValue getOwnedNullValue() {
    return () adaptersFactory.createAdapter(adaptee.getOwnedNullValue(), eResource);
  }
  
  @Override
  public void setOwnedNullValue(final org.gemoc.scenario.xdsml.functionscenariomt.information.datavalue.DataValue o) {
    if (o != null)
    	adaptee.setOwnedNullValue(((org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.information.datavalue.DataValueAdapter) o).getAdaptee());
    else adaptee.setOwnedNullValue(null);
  }
  
  @Override
  public org.gemoc.scenario.xdsml.functionscenariomt.information.datavalue.NumericValue getOwnedMinCard() {
    return () adaptersFactory.createAdapter(adaptee.getOwnedMinCard(), eResource);
  }
  
  @Override
  public void setOwnedMinCard(final org.gemoc.scenario.xdsml.functionscenariomt.information.datavalue.NumericValue o) {
    if (o != null)
    	adaptee.setOwnedMinCard(((org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.information.datavalue.NumericValueAdapter) o).getAdaptee());
    else adaptee.setOwnedMinCard(null);
  }
  
  @Override
  public org.gemoc.scenario.xdsml.functionscenariomt.information.datavalue.NumericValue getOwnedMinLength() {
    return () adaptersFactory.createAdapter(adaptee.getOwnedMinLength(), eResource);
  }
  
  @Override
  public void setOwnedMinLength(final org.gemoc.scenario.xdsml.functionscenariomt.information.datavalue.NumericValue o) {
    if (o != null)
    	adaptee.setOwnedMinLength(((org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.information.datavalue.NumericValueAdapter) o).getAdaptee());
    else adaptee.setOwnedMinLength(null);
  }
  
  @Override
  public org.gemoc.scenario.xdsml.functionscenariomt.information.datavalue.NumericValue getOwnedMaxCard() {
    return () adaptersFactory.createAdapter(adaptee.getOwnedMaxCard(), eResource);
  }
  
  @Override
  public void setOwnedMaxCard(final org.gemoc.scenario.xdsml.functionscenariomt.information.datavalue.NumericValue o) {
    if (o != null)
    	adaptee.setOwnedMaxCard(((org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.information.datavalue.NumericValueAdapter) o).getAdaptee());
    else adaptee.setOwnedMaxCard(null);
  }
  
  @Override
  public org.gemoc.scenario.xdsml.functionscenariomt.information.datavalue.NumericValue getOwnedMaxLength() {
    return () adaptersFactory.createAdapter(adaptee.getOwnedMaxLength(), eResource);
  }
  
  @Override
  public void setOwnedMaxLength(final org.gemoc.scenario.xdsml.functionscenariomt.information.datavalue.NumericValue o) {
    if (o != null)
    	adaptee.setOwnedMaxLength(((org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.information.datavalue.NumericValueAdapter) o).getAdaptee());
    else adaptee.setOwnedMaxLength(null);
  }
  
  @Override
  public void destroy() {
    adaptee.destroy();
  }
  
  @Override
  public String getFullLabel() {
    return adaptee.getFullLabel();
  }
  
  @Override
  public String getLabel() {
    return adaptee.getLabel();
  }
  
  @Override
  public boolean hasUnnamedLabel() {
    return adaptee.hasUnnamedLabel();
  }
  
  protected final static String ID_EDEFAULT = null;
  
  protected final static String SID_EDEFAULT = null;
  
  protected final static boolean VISIBLE_IN_DOC_EDEFAULT = true;
  
  protected final static boolean VISIBLE_IN_LM_EDEFAULT = true;
  
  protected final static String SUMMARY_EDEFAULT = null;
  
  protected final static String DESCRIPTION_EDEFAULT = null;
  
  protected final static String REVIEW_EDEFAULT = null;
  
  protected final static boolean ORDERED_EDEFAULT = false;
  
  protected final static boolean UNIQUE_EDEFAULT = false;
  
  protected final static boolean MIN_INCLUSIVE_EDEFAULT = false;
  
  protected final static boolean MAX_INCLUSIVE_EDEFAULT = false;
  
  @Override
  public EClass eClass() {
    return org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.eINSTANCE.getMultiplicityElement();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.MULTIPLICITY_ELEMENT__OWNED_EXTENSIONS:
    		return getOwnedExtensions();
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.MULTIPLICITY_ELEMENT__ID:
    		return getId();
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.MULTIPLICITY_ELEMENT__SID:
    		return getSid();
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.MULTIPLICITY_ELEMENT__CONSTRAINTS:
    		return getConstraints();
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.MULTIPLICITY_ELEMENT__OWNED_CONSTRAINTS:
    		return getOwnedConstraints();
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.MULTIPLICITY_ELEMENT__INCOMING_TRACES:
    		return getIncomingTraces();
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.MULTIPLICITY_ELEMENT__OUTGOING_TRACES:
    		return getOutgoingTraces();
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.MULTIPLICITY_ELEMENT__VISIBLE_IN_DOC:
    		return isVisibleInDoc() ? Boolean.TRUE : Boolean.FALSE;
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.MULTIPLICITY_ELEMENT__VISIBLE_IN_LM:
    		return isVisibleInLM() ? Boolean.TRUE : Boolean.FALSE;
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.MULTIPLICITY_ELEMENT__SUMMARY:
    		return getSummary();
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.MULTIPLICITY_ELEMENT__DESCRIPTION:
    		return getDescription();
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.MULTIPLICITY_ELEMENT__REVIEW:
    		return getReview();
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.MULTIPLICITY_ELEMENT__OWNED_PROPERTY_VALUES:
    		return getOwnedPropertyValues();
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.MULTIPLICITY_ELEMENT__OWNED_ENUMERATION_PROPERTY_TYPES:
    		return getOwnedEnumerationPropertyTypes();
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.MULTIPLICITY_ELEMENT__APPLIED_PROPERTY_VALUES:
    		return getAppliedPropertyValues();
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.MULTIPLICITY_ELEMENT__OWNED_PROPERTY_VALUE_GROUPS:
    		return getOwnedPropertyValueGroups();
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.MULTIPLICITY_ELEMENT__APPLIED_PROPERTY_VALUE_GROUPS:
    		return getAppliedPropertyValueGroups();
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.MULTIPLICITY_ELEMENT__STATUS:
    		return getStatus();
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.MULTIPLICITY_ELEMENT__FEATURES:
    		return getFeatures();
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.MULTIPLICITY_ELEMENT__APPLIED_REQUIREMENTS:
    		return getAppliedRequirements();
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.MULTIPLICITY_ELEMENT__ORDERED:
    		return isOrdered() ? Boolean.TRUE : Boolean.FALSE;
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.MULTIPLICITY_ELEMENT__UNIQUE:
    		return isUnique() ? Boolean.TRUE : Boolean.FALSE;
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.MULTIPLICITY_ELEMENT__MIN_INCLUSIVE:
    		return isMinInclusive() ? Boolean.TRUE : Boolean.FALSE;
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.MULTIPLICITY_ELEMENT__MAX_INCLUSIVE:
    		return isMaxInclusive() ? Boolean.TRUE : Boolean.FALSE;
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.MULTIPLICITY_ELEMENT__OWNED_DEFAULT_VALUE:
    		return getOwnedDefaultValue();
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.MULTIPLICITY_ELEMENT__OWNED_MIN_VALUE:
    		return getOwnedMinValue();
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.MULTIPLICITY_ELEMENT__OWNED_MAX_VALUE:
    		return getOwnedMaxValue();
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.MULTIPLICITY_ELEMENT__OWNED_NULL_VALUE:
    		return getOwnedNullValue();
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.MULTIPLICITY_ELEMENT__OWNED_MIN_CARD:
    		return getOwnedMinCard();
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.MULTIPLICITY_ELEMENT__OWNED_MIN_LENGTH:
    		return getOwnedMinLength();
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.MULTIPLICITY_ELEMENT__OWNED_MAX_CARD:
    		return getOwnedMaxCard();
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.MULTIPLICITY_ELEMENT__OWNED_MAX_LENGTH:
    		return getOwnedMaxLength();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.MULTIPLICITY_ELEMENT__OWNED_EXTENSIONS:
    		return getOwnedExtensions() != null && !getOwnedExtensions().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.MULTIPLICITY_ELEMENT__ID:
    		return getId() != ID_EDEFAULT;
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.MULTIPLICITY_ELEMENT__SID:
    		return getSid() != SID_EDEFAULT;
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.MULTIPLICITY_ELEMENT__CONSTRAINTS:
    		return getConstraints() != null && !getConstraints().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.MULTIPLICITY_ELEMENT__OWNED_CONSTRAINTS:
    		return getOwnedConstraints() != null && !getOwnedConstraints().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.MULTIPLICITY_ELEMENT__INCOMING_TRACES:
    		return getIncomingTraces() != null && !getIncomingTraces().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.MULTIPLICITY_ELEMENT__OUTGOING_TRACES:
    		return getOutgoingTraces() != null && !getOutgoingTraces().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.MULTIPLICITY_ELEMENT__VISIBLE_IN_DOC:
    		return isVisibleInDoc() != VISIBLE_IN_DOC_EDEFAULT;
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.MULTIPLICITY_ELEMENT__VISIBLE_IN_LM:
    		return isVisibleInLM() != VISIBLE_IN_LM_EDEFAULT;
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.MULTIPLICITY_ELEMENT__SUMMARY:
    		return getSummary() != SUMMARY_EDEFAULT;
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.MULTIPLICITY_ELEMENT__DESCRIPTION:
    		return getDescription() != DESCRIPTION_EDEFAULT;
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.MULTIPLICITY_ELEMENT__REVIEW:
    		return getReview() != REVIEW_EDEFAULT;
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.MULTIPLICITY_ELEMENT__OWNED_PROPERTY_VALUES:
    		return getOwnedPropertyValues() != null && !getOwnedPropertyValues().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.MULTIPLICITY_ELEMENT__OWNED_ENUMERATION_PROPERTY_TYPES:
    		return getOwnedEnumerationPropertyTypes() != null && !getOwnedEnumerationPropertyTypes().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.MULTIPLICITY_ELEMENT__APPLIED_PROPERTY_VALUES:
    		return getAppliedPropertyValues() != null && !getAppliedPropertyValues().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.MULTIPLICITY_ELEMENT__OWNED_PROPERTY_VALUE_GROUPS:
    		return getOwnedPropertyValueGroups() != null && !getOwnedPropertyValueGroups().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.MULTIPLICITY_ELEMENT__APPLIED_PROPERTY_VALUE_GROUPS:
    		return getAppliedPropertyValueGroups() != null && !getAppliedPropertyValueGroups().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.MULTIPLICITY_ELEMENT__STATUS:
    		return getStatus() != null;
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.MULTIPLICITY_ELEMENT__FEATURES:
    		return getFeatures() != null && !getFeatures().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.MULTIPLICITY_ELEMENT__APPLIED_REQUIREMENTS:
    		return getAppliedRequirements() != null && !getAppliedRequirements().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.MULTIPLICITY_ELEMENT__ORDERED:
    		return isOrdered() != ORDERED_EDEFAULT;
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.MULTIPLICITY_ELEMENT__UNIQUE:
    		return isUnique() != UNIQUE_EDEFAULT;
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.MULTIPLICITY_ELEMENT__MIN_INCLUSIVE:
    		return isMinInclusive() != MIN_INCLUSIVE_EDEFAULT;
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.MULTIPLICITY_ELEMENT__MAX_INCLUSIVE:
    		return isMaxInclusive() != MAX_INCLUSIVE_EDEFAULT;
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.MULTIPLICITY_ELEMENT__OWNED_DEFAULT_VALUE:
    		return getOwnedDefaultValue() != null;
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.MULTIPLICITY_ELEMENT__OWNED_MIN_VALUE:
    		return getOwnedMinValue() != null;
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.MULTIPLICITY_ELEMENT__OWNED_MAX_VALUE:
    		return getOwnedMaxValue() != null;
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.MULTIPLICITY_ELEMENT__OWNED_NULL_VALUE:
    		return getOwnedNullValue() != null;
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.MULTIPLICITY_ELEMENT__OWNED_MIN_CARD:
    		return getOwnedMinCard() != null;
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.MULTIPLICITY_ELEMENT__OWNED_MIN_LENGTH:
    		return getOwnedMinLength() != null;
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.MULTIPLICITY_ELEMENT__OWNED_MAX_CARD:
    		return getOwnedMaxCard() != null;
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.MULTIPLICITY_ELEMENT__OWNED_MAX_LENGTH:
    		return getOwnedMaxLength() != null;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.MULTIPLICITY_ELEMENT__OWNED_EXTENSIONS:
    		getOwnedExtensions().clear();
    		getOwnedExtensions().addAll((Collection) newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.MULTIPLICITY_ELEMENT__ID:
    		setId(
    		(java.lang.String)
    		 newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.MULTIPLICITY_ELEMENT__SID:
    		setSid(
    		(java.lang.String)
    		 newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.MULTIPLICITY_ELEMENT__OWNED_CONSTRAINTS:
    		getOwnedConstraints().clear();
    		getOwnedConstraints().addAll((Collection) newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.MULTIPLICITY_ELEMENT__VISIBLE_IN_DOC:
    		setVisibleInDoc(((java.lang.Boolean) newValue).booleanValue());
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.MULTIPLICITY_ELEMENT__VISIBLE_IN_LM:
    		setVisibleInLM(((java.lang.Boolean) newValue).booleanValue());
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.MULTIPLICITY_ELEMENT__SUMMARY:
    		setSummary(
    		(java.lang.String)
    		 newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.MULTIPLICITY_ELEMENT__DESCRIPTION:
    		setDescription(
    		(java.lang.String)
    		 newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.MULTIPLICITY_ELEMENT__REVIEW:
    		setReview(
    		(java.lang.String)
    		 newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.MULTIPLICITY_ELEMENT__OWNED_PROPERTY_VALUES:
    		getOwnedPropertyValues().clear();
    		getOwnedPropertyValues().addAll((Collection) newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.MULTIPLICITY_ELEMENT__OWNED_ENUMERATION_PROPERTY_TYPES:
    		getOwnedEnumerationPropertyTypes().clear();
    		getOwnedEnumerationPropertyTypes().addAll((Collection) newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.MULTIPLICITY_ELEMENT__APPLIED_PROPERTY_VALUES:
    		getAppliedPropertyValues().clear();
    		getAppliedPropertyValues().addAll((Collection) newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.MULTIPLICITY_ELEMENT__OWNED_PROPERTY_VALUE_GROUPS:
    		getOwnedPropertyValueGroups().clear();
    		getOwnedPropertyValueGroups().addAll((Collection) newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.MULTIPLICITY_ELEMENT__APPLIED_PROPERTY_VALUE_GROUPS:
    		getAppliedPropertyValueGroups().clear();
    		getAppliedPropertyValueGroups().addAll((Collection) newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.MULTIPLICITY_ELEMENT__STATUS:
    		setStatus(
    		(org.gemoc.scenario.xdsml.functionscenariomt.capellacore.EnumerationPropertyLiteral)
    		 newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.MULTIPLICITY_ELEMENT__FEATURES:
    		getFeatures().clear();
    		getFeatures().addAll((Collection) newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.MULTIPLICITY_ELEMENT__ORDERED:
    		setOrdered(((java.lang.Boolean) newValue).booleanValue());
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.MULTIPLICITY_ELEMENT__UNIQUE:
    		setUnique(((java.lang.Boolean) newValue).booleanValue());
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.MULTIPLICITY_ELEMENT__MIN_INCLUSIVE:
    		setMinInclusive(((java.lang.Boolean) newValue).booleanValue());
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.MULTIPLICITY_ELEMENT__MAX_INCLUSIVE:
    		setMaxInclusive(((java.lang.Boolean) newValue).booleanValue());
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.MULTIPLICITY_ELEMENT__OWNED_DEFAULT_VALUE:
    		setOwnedDefaultValue(
    		(org.gemoc.scenario.xdsml.functionscenariomt.information.datavalue.DataValue)
    		 newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.MULTIPLICITY_ELEMENT__OWNED_MIN_VALUE:
    		setOwnedMinValue(
    		(org.gemoc.scenario.xdsml.functionscenariomt.information.datavalue.DataValue)
    		 newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.MULTIPLICITY_ELEMENT__OWNED_MAX_VALUE:
    		setOwnedMaxValue(
    		(org.gemoc.scenario.xdsml.functionscenariomt.information.datavalue.DataValue)
    		 newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.MULTIPLICITY_ELEMENT__OWNED_NULL_VALUE:
    		setOwnedNullValue(
    		(org.gemoc.scenario.xdsml.functionscenariomt.information.datavalue.DataValue)
    		 newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.MULTIPLICITY_ELEMENT__OWNED_MIN_CARD:
    		setOwnedMinCard(
    		(org.gemoc.scenario.xdsml.functionscenariomt.information.datavalue.NumericValue)
    		 newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.MULTIPLICITY_ELEMENT__OWNED_MIN_LENGTH:
    		setOwnedMinLength(
    		(org.gemoc.scenario.xdsml.functionscenariomt.information.datavalue.NumericValue)
    		 newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.MULTIPLICITY_ELEMENT__OWNED_MAX_CARD:
    		setOwnedMaxCard(
    		(org.gemoc.scenario.xdsml.functionscenariomt.information.datavalue.NumericValue)
    		 newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.MULTIPLICITY_ELEMENT__OWNED_MAX_LENGTH:
    		setOwnedMaxLength(
    		(org.gemoc.scenario.xdsml.functionscenariomt.information.datavalue.NumericValue)
    		 newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
  
  @Override
  public int eBaseStructuralFeatureID(final int derivedFeatureID, final Class<?> baseClass) {
    if (baseClass == org.gemoc.scenario.xdsml.functionscenariomt.modellingcore.PublishableElement.class) {
    	switch (derivedFeatureID) {
    		case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.MULTIPLICITY_ELEMENT__VISIBLE_IN_DOC:
    			return org.gemoc.scenario.xdsml.functionscenariomt.modellingcore.ModellingcorePackage.PUBLISHABLE_ELEMENT__VISIBLE_IN_DOC;
    		case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.MULTIPLICITY_ELEMENT__VISIBLE_IN_LM:
    			return org.gemoc.scenario.xdsml.functionscenariomt.modellingcore.ModellingcorePackage.PUBLISHABLE_ELEMENT__VISIBLE_IN_LM;
    		default: return -1;
    	}
    }
    
    return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
  }
  
  @Override
  public int eDerivedStructuralFeatureID(final int baseFeatureID, final Class<?> baseClass) {
    if (baseClass == org.gemoc.scenario.xdsml.functionscenariomt.modellingcore.PublishableElement.class) {
    	switch (baseFeatureID) {
    		case org.gemoc.scenario.xdsml.functionscenariomt.modellingcore.ModellingcorePackage.PUBLISHABLE_ELEMENT__VISIBLE_IN_DOC:
    			return org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.MULTIPLICITY_ELEMENT__VISIBLE_IN_DOC;
    		case org.gemoc.scenario.xdsml.functionscenariomt.modellingcore.ModellingcorePackage.PUBLISHABLE_ELEMENT__VISIBLE_IN_LM:
    			return org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.MULTIPLICITY_ELEMENT__VISIBLE_IN_LM;
    		default: return -1;
    	}
    }
    
    
    return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
  }
}
