/*
 * generated by Xtext 2.10.0
 */
grammar InternalVideoGen;

options {
	superClass=AbstractInternalAntlrParser;
}

@lexer::header {
package org.xtext.example.mydsl.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package org.xtext.example.mydsl.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.example.mydsl.services.VideoGenGrammarAccess;

}

@parser::members {

 	private VideoGenGrammarAccess grammarAccess;

    public InternalVideoGenParser(TokenStream input, VideoGenGrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }

    @Override
    protected String getFirstRuleName() {
    	return "VideoGeneratorModel";
   	}

   	@Override
   	protected VideoGenGrammarAccess getGrammarAccess() {
   		return grammarAccess;
   	}

}

@rulecatch {
    catch (RecognitionException re) {
        recover(input,re);
        appendSkippedTokens();
    }
}

// Entry rule entryRuleVideoGeneratorModel
entryRuleVideoGeneratorModel returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getVideoGeneratorModelRule()); }
	iv_ruleVideoGeneratorModel=ruleVideoGeneratorModel
	{ $current=$iv_ruleVideoGeneratorModel.current; }
	EOF;

// Rule VideoGeneratorModel
ruleVideoGeneratorModel returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getVideoGeneratorModelAccess().getVideoGeneratorModelAction_0(),
					$current);
			}
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getVideoGeneratorModelAccess().getInformationVideoGenInformationParserRuleCall_1_0());
				}
				lv_information_1_0=ruleVideoGenInformation
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getVideoGeneratorModelRule());
					}
					set(
						$current,
						"information",
						lv_information_1_0,
						"org.xtext.example.mydsl.VideoGen.VideoGenInformation");
					afterParserOrEnumRuleCall();
				}
			)
		)?
		otherlv_2='VideoGen'
		{
			newLeafNode(otherlv_2, grammarAccess.getVideoGeneratorModelAccess().getVideoGenKeyword_2());
		}
		this_LEFT_BRACKET_3=RULE_LEFT_BRACKET
		{
			newLeafNode(this_LEFT_BRACKET_3, grammarAccess.getVideoGeneratorModelAccess().getLEFT_BRACKETTerminalRuleCall_3());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getVideoGeneratorModelAccess().getMediasMediaParserRuleCall_4_0());
				}
				lv_medias_4_0=ruleMedia
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getVideoGeneratorModelRule());
					}
					add(
						$current,
						"medias",
						lv_medias_4_0,
						"org.xtext.example.mydsl.VideoGen.Media");
					afterParserOrEnumRuleCall();
				}
			)
		)+
		this_RIGHT_BRACKET_5=RULE_RIGHT_BRACKET
		{
			newLeafNode(this_RIGHT_BRACKET_5, grammarAccess.getVideoGeneratorModelAccess().getRIGHT_BRACKETTerminalRuleCall_5());
		}
	)
;

// Entry rule entryRuleVideoGenInformation
entryRuleVideoGenInformation returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getVideoGenInformationRule()); }
	iv_ruleVideoGenInformation=ruleVideoGenInformation
	{ $current=$iv_ruleVideoGenInformation.current; }
	EOF;

// Rule VideoGenInformation
ruleVideoGenInformation returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getVideoGenInformationAccess().getVideoGenInformationAction_0(),
					$current);
			}
		)
		(
			otherlv_1='@author'
			{
				newLeafNode(otherlv_1, grammarAccess.getVideoGenInformationAccess().getAuthorKeyword_1_0());
			}
			(
				(
					lv_authorName_2_0=RULE_STRING
					{
						newLeafNode(lv_authorName_2_0, grammarAccess.getVideoGenInformationAccess().getAuthorNameSTRINGTerminalRuleCall_1_1_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getVideoGenInformationRule());
						}
						setWithLastConsumed(
							$current,
							"authorName",
							lv_authorName_2_0,
							"org.eclipse.xtext.common.Terminals.STRING");
					}
				)
			)
		)
		(
			otherlv_3='@version'
			{
				newLeafNode(otherlv_3, grammarAccess.getVideoGenInformationAccess().getVersionKeyword_2_0());
			}
			(
				(
					lv_version_4_0=RULE_STRING
					{
						newLeafNode(lv_version_4_0, grammarAccess.getVideoGenInformationAccess().getVersionSTRINGTerminalRuleCall_2_1_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getVideoGenInformationRule());
						}
						setWithLastConsumed(
							$current,
							"version",
							lv_version_4_0,
							"org.eclipse.xtext.common.Terminals.STRING");
					}
				)
			)
		)?
		(
			otherlv_5='@creation'
			{
				newLeafNode(otherlv_5, grammarAccess.getVideoGenInformationAccess().getCreationKeyword_3_0());
			}
			(
				(
					lv_creationDate_6_0=RULE_STRING
					{
						newLeafNode(lv_creationDate_6_0, grammarAccess.getVideoGenInformationAccess().getCreationDateSTRINGTerminalRuleCall_3_1_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getVideoGenInformationRule());
						}
						setWithLastConsumed(
							$current,
							"creationDate",
							lv_creationDate_6_0,
							"org.eclipse.xtext.common.Terminals.STRING");
					}
				)
			)
		)?
	)
;

// Entry rule entryRuleMedia
entryRuleMedia returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getMediaRule()); }
	iv_ruleMedia=ruleMedia
	{ $current=$iv_ruleMedia.current; }
	EOF;

// Rule Media
ruleMedia returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getMediaAccess().getImageParserRuleCall_0());
		}
		this_Image_0=ruleImage
		{
			$current = $this_Image_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getMediaAccess().getVideoSeqParserRuleCall_1());
		}
		this_VideoSeq_1=ruleVideoSeq
		{
			$current = $this_VideoSeq_1.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleImage
entryRuleImage returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getImageRule()); }
	iv_ruleImage=ruleImage
	{ $current=$iv_ruleImage.current; }
	EOF;

// Rule Image
ruleImage returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getImageAccess().getMandatoryImageParserRuleCall_0());
		}
		this_MandatoryImage_0=ruleMandatoryImage
		{
			$current = $this_MandatoryImage_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getImageAccess().getOptionalImageParserRuleCall_1());
		}
		this_OptionalImage_1=ruleOptionalImage
		{
			$current = $this_OptionalImage_1.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getImageAccess().getAlternativeImageParserRuleCall_2());
		}
		this_AlternativeImage_2=ruleAlternativeImage
		{
			$current = $this_AlternativeImage_2.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleMandatoryImage
entryRuleMandatoryImage returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getMandatoryImageRule()); }
	iv_ruleMandatoryImage=ruleMandatoryImage
	{ $current=$iv_ruleMandatoryImage.current; }
	EOF;

// Rule MandatoryImage
ruleMandatoryImage returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='mandatory'
		{
			newLeafNode(otherlv_0, grammarAccess.getMandatoryImageAccess().getMandatoryKeyword_0());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getMandatoryImageAccess().getDescriptionImageDescriptionParserRuleCall_1_0());
				}
				lv_description_1_0=ruleImageDescription
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getMandatoryImageRule());
					}
					set(
						$current,
						"description",
						lv_description_1_0,
						"org.xtext.example.mydsl.VideoGen.ImageDescription");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleOptionalImage
entryRuleOptionalImage returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getOptionalImageRule()); }
	iv_ruleOptionalImage=ruleOptionalImage
	{ $current=$iv_ruleOptionalImage.current; }
	EOF;

// Rule OptionalImage
ruleOptionalImage returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='optional'
		{
			newLeafNode(otherlv_0, grammarAccess.getOptionalImageAccess().getOptionalKeyword_0());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getOptionalImageAccess().getDescriptionImageDescriptionParserRuleCall_1_0());
				}
				lv_description_1_0=ruleImageDescription
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getOptionalImageRule());
					}
					set(
						$current,
						"description",
						lv_description_1_0,
						"org.xtext.example.mydsl.VideoGen.ImageDescription");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleAlternativeImage
entryRuleAlternativeImage returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getAlternativeImageRule()); }
	iv_ruleAlternativeImage=ruleAlternativeImage
	{ $current=$iv_ruleAlternativeImage.current; }
	EOF;

// Rule AlternativeImage
ruleAlternativeImage returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='alternatives'
		{
			newLeafNode(otherlv_0, grammarAccess.getAlternativeImageAccess().getAlternativesKeyword_0());
		}
		(
			(
				lv_imageid_1_0=RULE_ID
				{
					newLeafNode(lv_imageid_1_0, grammarAccess.getAlternativeImageAccess().getImageidIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getAlternativeImageRule());
					}
					setWithLastConsumed(
						$current,
						"imageid",
						lv_imageid_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)?
		this_LEFT_BRACKET_2=RULE_LEFT_BRACKET
		{
			newLeafNode(this_LEFT_BRACKET_2, grammarAccess.getAlternativeImageAccess().getLEFT_BRACKETTerminalRuleCall_2());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getAlternativeImageAccess().getImagesImageDescriptionParserRuleCall_3_0());
				}
				lv_images_3_0=ruleImageDescription
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getAlternativeImageRule());
					}
					add(
						$current,
						"images",
						lv_images_3_0,
						"org.xtext.example.mydsl.VideoGen.ImageDescription");
					afterParserOrEnumRuleCall();
				}
			)
		)+
		this_RIGHT_BRACKET_4=RULE_RIGHT_BRACKET
		{
			newLeafNode(this_RIGHT_BRACKET_4, grammarAccess.getAlternativeImageAccess().getRIGHT_BRACKETTerminalRuleCall_4());
		}
	)
;

// Entry rule entryRuleImageDescription
entryRuleImageDescription returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getImageDescriptionRule()); }
	iv_ruleImageDescription=ruleImageDescription
	{ $current=$iv_ruleImageDescription.current; }
	EOF;

// Rule ImageDescription
ruleImageDescription returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='image'
		{
			newLeafNode(otherlv_0, grammarAccess.getImageDescriptionAccess().getImageKeyword_0());
		}
		(
			(
				lv_imageid_1_0=RULE_ID
				{
					newLeafNode(lv_imageid_1_0, grammarAccess.getImageDescriptionAccess().getImageidIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getImageDescriptionRule());
					}
					setWithLastConsumed(
						$current,
						"imageid",
						lv_imageid_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)?
		(
			(
				lv_location_2_0=RULE_STRING
				{
					newLeafNode(lv_location_2_0, grammarAccess.getImageDescriptionAccess().getLocationSTRINGTerminalRuleCall_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getImageDescriptionRule());
					}
					setWithLastConsumed(
						$current,
						"location",
						lv_location_2_0,
						"org.eclipse.xtext.common.Terminals.STRING");
				}
			)
		)
		(
			this_LEFT_BRACKET_3=RULE_LEFT_BRACKET
			{
				newLeafNode(this_LEFT_BRACKET_3, grammarAccess.getImageDescriptionAccess().getLEFT_BRACKETTerminalRuleCall_3_0());
			}
			(
				otherlv_4='toptext'
				{
					newLeafNode(otherlv_4, grammarAccess.getImageDescriptionAccess().getToptextKeyword_3_1_0());
				}
				(
					(
						lv_top_5_0=RULE_STRING
						{
							newLeafNode(lv_top_5_0, grammarAccess.getImageDescriptionAccess().getTopSTRINGTerminalRuleCall_3_1_1_0());
						}
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getImageDescriptionRule());
							}
							setWithLastConsumed(
								$current,
								"top",
								lv_top_5_0,
								"org.eclipse.xtext.common.Terminals.STRING");
						}
					)
				)
			)
			(
				otherlv_6='bottomtext'
				{
					newLeafNode(otherlv_6, grammarAccess.getImageDescriptionAccess().getBottomtextKeyword_3_2_0());
				}
				(
					(
						lv_bottom_7_0=RULE_STRING
						{
							newLeafNode(lv_bottom_7_0, grammarAccess.getImageDescriptionAccess().getBottomSTRINGTerminalRuleCall_3_2_1_0());
						}
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getImageDescriptionRule());
							}
							setWithLastConsumed(
								$current,
								"bottom",
								lv_bottom_7_0,
								"org.eclipse.xtext.common.Terminals.STRING");
						}
					)
				)
			)
			this_RIGHT_BRACKET_8=RULE_RIGHT_BRACKET
			{
				newLeafNode(this_RIGHT_BRACKET_8, grammarAccess.getImageDescriptionAccess().getRIGHT_BRACKETTerminalRuleCall_3_3());
			}
		)?
	)
;

// Entry rule entryRuleVideoSeq
entryRuleVideoSeq returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getVideoSeqRule()); }
	iv_ruleVideoSeq=ruleVideoSeq
	{ $current=$iv_ruleVideoSeq.current; }
	EOF;

// Rule VideoSeq
ruleVideoSeq returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getVideoSeqAccess().getMandatoryVideoSeqParserRuleCall_0());
		}
		this_MandatoryVideoSeq_0=ruleMandatoryVideoSeq
		{
			$current = $this_MandatoryVideoSeq_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getVideoSeqAccess().getOptionalVideoSeqParserRuleCall_1());
		}
		this_OptionalVideoSeq_1=ruleOptionalVideoSeq
		{
			$current = $this_OptionalVideoSeq_1.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getVideoSeqAccess().getAlternativeVideoSeqParserRuleCall_2());
		}
		this_AlternativeVideoSeq_2=ruleAlternativeVideoSeq
		{
			$current = $this_AlternativeVideoSeq_2.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleMandatoryVideoSeq
entryRuleMandatoryVideoSeq returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getMandatoryVideoSeqRule()); }
	iv_ruleMandatoryVideoSeq=ruleMandatoryVideoSeq
	{ $current=$iv_ruleMandatoryVideoSeq.current; }
	EOF;

// Rule MandatoryVideoSeq
ruleMandatoryVideoSeq returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='mandatory'
		{
			newLeafNode(otherlv_0, grammarAccess.getMandatoryVideoSeqAccess().getMandatoryKeyword_0());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getMandatoryVideoSeqAccess().getDescriptionVideoDescriptionParserRuleCall_1_0());
				}
				lv_description_1_0=ruleVideoDescription
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getMandatoryVideoSeqRule());
					}
					set(
						$current,
						"description",
						lv_description_1_0,
						"org.xtext.example.mydsl.VideoGen.VideoDescription");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleOptionalVideoSeq
entryRuleOptionalVideoSeq returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getOptionalVideoSeqRule()); }
	iv_ruleOptionalVideoSeq=ruleOptionalVideoSeq
	{ $current=$iv_ruleOptionalVideoSeq.current; }
	EOF;

// Rule OptionalVideoSeq
ruleOptionalVideoSeq returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='optional'
		{
			newLeafNode(otherlv_0, grammarAccess.getOptionalVideoSeqAccess().getOptionalKeyword_0());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getOptionalVideoSeqAccess().getDescriptionVideoDescriptionParserRuleCall_1_0());
				}
				lv_description_1_0=ruleVideoDescription
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getOptionalVideoSeqRule());
					}
					set(
						$current,
						"description",
						lv_description_1_0,
						"org.xtext.example.mydsl.VideoGen.VideoDescription");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleAlternativeVideoSeq
entryRuleAlternativeVideoSeq returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getAlternativeVideoSeqRule()); }
	iv_ruleAlternativeVideoSeq=ruleAlternativeVideoSeq
	{ $current=$iv_ruleAlternativeVideoSeq.current; }
	EOF;

// Rule AlternativeVideoSeq
ruleAlternativeVideoSeq returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='alternatives'
		{
			newLeafNode(otherlv_0, grammarAccess.getAlternativeVideoSeqAccess().getAlternativesKeyword_0());
		}
		(
			(
				lv_videoid_1_0=RULE_ID
				{
					newLeafNode(lv_videoid_1_0, grammarAccess.getAlternativeVideoSeqAccess().getVideoidIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getAlternativeVideoSeqRule());
					}
					setWithLastConsumed(
						$current,
						"videoid",
						lv_videoid_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)?
		this_LEFT_BRACKET_2=RULE_LEFT_BRACKET
		{
			newLeafNode(this_LEFT_BRACKET_2, grammarAccess.getAlternativeVideoSeqAccess().getLEFT_BRACKETTerminalRuleCall_2());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getAlternativeVideoSeqAccess().getVideodescsVideoDescriptionParserRuleCall_3_0());
				}
				lv_videodescs_3_0=ruleVideoDescription
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getAlternativeVideoSeqRule());
					}
					add(
						$current,
						"videodescs",
						lv_videodescs_3_0,
						"org.xtext.example.mydsl.VideoGen.VideoDescription");
					afterParserOrEnumRuleCall();
				}
			)
		)+
		this_RIGHT_BRACKET_4=RULE_RIGHT_BRACKET
		{
			newLeafNode(this_RIGHT_BRACKET_4, grammarAccess.getAlternativeVideoSeqAccess().getRIGHT_BRACKETTerminalRuleCall_4());
		}
	)
;

// Entry rule entryRuleVideoDescription
entryRuleVideoDescription returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getVideoDescriptionRule()); }
	iv_ruleVideoDescription=ruleVideoDescription
	{ $current=$iv_ruleVideoDescription.current; }
	EOF;

// Rule VideoDescription
ruleVideoDescription returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='videoseq'
		{
			newLeafNode(otherlv_0, grammarAccess.getVideoDescriptionAccess().getVideoseqKeyword_0());
		}
		(
			(
				lv_videoid_1_0=RULE_ID
				{
					newLeafNode(lv_videoid_1_0, grammarAccess.getVideoDescriptionAccess().getVideoidIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getVideoDescriptionRule());
					}
					setWithLastConsumed(
						$current,
						"videoid",
						lv_videoid_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)?
		(
			(
				lv_location_2_0=RULE_STRING
				{
					newLeafNode(lv_location_2_0, grammarAccess.getVideoDescriptionAccess().getLocationSTRINGTerminalRuleCall_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getVideoDescriptionRule());
					}
					setWithLastConsumed(
						$current,
						"location",
						lv_location_2_0,
						"org.eclipse.xtext.common.Terminals.STRING");
				}
			)
		)
		(
			this_LEFT_BRACKET_3=RULE_LEFT_BRACKET
			{
				newLeafNode(this_LEFT_BRACKET_3, grammarAccess.getVideoDescriptionAccess().getLEFT_BRACKETTerminalRuleCall_3_0());
			}
			(
				otherlv_4='duration'
				{
					newLeafNode(otherlv_4, grammarAccess.getVideoDescriptionAccess().getDurationKeyword_3_1_0());
				}
				(
					(
						lv_duration_5_0=RULE_INT
						{
							newLeafNode(lv_duration_5_0, grammarAccess.getVideoDescriptionAccess().getDurationINTTerminalRuleCall_3_1_1_0());
						}
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getVideoDescriptionRule());
							}
							setWithLastConsumed(
								$current,
								"duration",
								lv_duration_5_0,
								"org.eclipse.xtext.common.Terminals.INT");
						}
					)
				)
			)?
			(
				otherlv_6='probability'
				{
					newLeafNode(otherlv_6, grammarAccess.getVideoDescriptionAccess().getProbabilityKeyword_3_2_0());
				}
				(
					(
						lv_probability_7_0=RULE_PERCENTAGE
						{
							newLeafNode(lv_probability_7_0, grammarAccess.getVideoDescriptionAccess().getProbabilityPERCENTAGETerminalRuleCall_3_2_1_0());
						}
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getVideoDescriptionRule());
							}
							setWithLastConsumed(
								$current,
								"probability",
								lv_probability_7_0,
								"org.xtext.example.mydsl.VideoGen.PERCENTAGE");
						}
					)
				)
			)?
			(
				otherlv_8='description'
				{
					newLeafNode(otherlv_8, grammarAccess.getVideoDescriptionAccess().getDescriptionKeyword_3_3_0());
				}
				(
					(
						lv_description_9_0=RULE_STRING
						{
							newLeafNode(lv_description_9_0, grammarAccess.getVideoDescriptionAccess().getDescriptionSTRINGTerminalRuleCall_3_3_1_0());
						}
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getVideoDescriptionRule());
							}
							setWithLastConsumed(
								$current,
								"description",
								lv_description_9_0,
								"org.eclipse.xtext.common.Terminals.STRING");
						}
					)
				)
			)?
			(
				otherlv_10='filter'
				{
					newLeafNode(otherlv_10, grammarAccess.getVideoDescriptionAccess().getFilterKeyword_3_4_0());
				}
				(
					(
						{
							newCompositeNode(grammarAccess.getVideoDescriptionAccess().getFilterFilterParserRuleCall_3_4_1_0());
						}
						lv_filter_11_0=ruleFilter
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getVideoDescriptionRule());
							}
							set(
								$current,
								"filter",
								lv_filter_11_0,
								"org.xtext.example.mydsl.VideoGen.Filter");
							afterParserOrEnumRuleCall();
						}
					)
				)
			)?
			(
				otherlv_12='text'
				{
					newLeafNode(otherlv_12, grammarAccess.getVideoDescriptionAccess().getTextKeyword_3_5_0());
				}
				(
					(
						{
							newCompositeNode(grammarAccess.getVideoDescriptionAccess().getTextTextParserRuleCall_3_5_1_0());
						}
						lv_text_13_0=ruleText
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getVideoDescriptionRule());
							}
							set(
								$current,
								"text",
								lv_text_13_0,
								"org.xtext.example.mydsl.VideoGen.Text");
							afterParserOrEnumRuleCall();
						}
					)
				)
			)?
			this_RIGHT_BRACKET_14=RULE_RIGHT_BRACKET
			{
				newLeafNode(this_RIGHT_BRACKET_14, grammarAccess.getVideoDescriptionAccess().getRIGHT_BRACKETTerminalRuleCall_3_6());
			}
		)?
	)
;

// Entry rule entryRuleText
entryRuleText returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getTextRule()); }
	iv_ruleText=ruleText
	{ $current=$iv_ruleText.current; }
	EOF;

// Rule Text
ruleText returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		this_LEFT_BRACKET_0=RULE_LEFT_BRACKET
		{
			newLeafNode(this_LEFT_BRACKET_0, grammarAccess.getTextAccess().getLEFT_BRACKETTerminalRuleCall_0());
		}
		otherlv_1='content'
		{
			newLeafNode(otherlv_1, grammarAccess.getTextAccess().getContentKeyword_1());
		}
		(
			(
				lv_content_2_0=RULE_STRING
				{
					newLeafNode(lv_content_2_0, grammarAccess.getTextAccess().getContentSTRINGTerminalRuleCall_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getTextRule());
					}
					setWithLastConsumed(
						$current,
						"content",
						lv_content_2_0,
						"org.eclipse.xtext.common.Terminals.STRING");
				}
			)
		)
		otherlv_3='position'
		{
			newLeafNode(otherlv_3, grammarAccess.getTextAccess().getPositionKeyword_3());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getTextAccess().getPositionPositionParserRuleCall_4_0());
				}
				lv_position_4_0=rulePosition
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getTextRule());
					}
					set(
						$current,
						"position",
						lv_position_4_0,
						"org.xtext.example.mydsl.VideoGen.Position");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			otherlv_5='color'
			{
				newLeafNode(otherlv_5, grammarAccess.getTextAccess().getColorKeyword_5_0());
			}
			(
				(
					lv_color_6_0=RULE_STRING
					{
						newLeafNode(lv_color_6_0, grammarAccess.getTextAccess().getColorSTRINGTerminalRuleCall_5_1_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getTextRule());
						}
						setWithLastConsumed(
							$current,
							"color",
							lv_color_6_0,
							"org.eclipse.xtext.common.Terminals.STRING");
					}
				)
			)
		)?
		(
			otherlv_7='size'
			{
				newLeafNode(otherlv_7, grammarAccess.getTextAccess().getSizeKeyword_6_0());
			}
			(
				(
					lv_size_8_0=RULE_INT
					{
						newLeafNode(lv_size_8_0, grammarAccess.getTextAccess().getSizeINTTerminalRuleCall_6_1_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getTextRule());
						}
						setWithLastConsumed(
							$current,
							"size",
							lv_size_8_0,
							"org.eclipse.xtext.common.Terminals.INT");
					}
				)
			)
		)?
		this_RIGHT_BRACKET_9=RULE_RIGHT_BRACKET
		{
			newLeafNode(this_RIGHT_BRACKET_9, grammarAccess.getTextAccess().getRIGHT_BRACKETTerminalRuleCall_7());
		}
	)
;

// Entry rule entryRulePosition
entryRulePosition returns [String current=null]:
	{ newCompositeNode(grammarAccess.getPositionRule()); }
	iv_rulePosition=rulePosition
	{ $current=$iv_rulePosition.current.getText(); }
	EOF;

// Rule Position
rulePosition returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		kw='TOP'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getPositionAccess().getTOPKeyword_0());
		}
		    |
		kw='BOTTOM'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getPositionAccess().getBOTTOMKeyword_1());
		}
		    |
		kw='CENTER'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getPositionAccess().getCENTERKeyword_2());
		}
	)
;

// Entry rule entryRuleFilter
entryRuleFilter returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getFilterRule()); }
	iv_ruleFilter=ruleFilter
	{ $current=$iv_ruleFilter.current; }
	EOF;

// Rule Filter
ruleFilter returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getFilterAccess().getFlipFilterParserRuleCall_0());
		}
		this_FlipFilter_0=ruleFlipFilter
		{
			$current = $this_FlipFilter_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getFilterAccess().getNegateFilterParserRuleCall_1());
		}
		this_NegateFilter_1=ruleNegateFilter
		{
			$current = $this_NegateFilter_1.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getFilterAccess().getBlackWhiteFilterParserRuleCall_2());
		}
		this_BlackWhiteFilter_2=ruleBlackWhiteFilter
		{
			$current = $this_BlackWhiteFilter_2.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleBlackWhiteFilter
entryRuleBlackWhiteFilter returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getBlackWhiteFilterRule()); }
	iv_ruleBlackWhiteFilter=ruleBlackWhiteFilter
	{ $current=$iv_ruleBlackWhiteFilter.current; }
	EOF;

// Rule BlackWhiteFilter
ruleBlackWhiteFilter returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getBlackWhiteFilterAccess().getBlackWhiteFilterAction_0(),
					$current);
			}
		)
		otherlv_1='b&w'
		{
			newLeafNode(otherlv_1, grammarAccess.getBlackWhiteFilterAccess().getBWKeyword_1());
		}
	)
;

// Entry rule entryRuleNegateFilter
entryRuleNegateFilter returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getNegateFilterRule()); }
	iv_ruleNegateFilter=ruleNegateFilter
	{ $current=$iv_ruleNegateFilter.current; }
	EOF;

// Rule NegateFilter
ruleNegateFilter returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getNegateFilterAccess().getNegateFilterAction_0(),
					$current);
			}
		)
		otherlv_1='negate'
		{
			newLeafNode(otherlv_1, grammarAccess.getNegateFilterAccess().getNegateKeyword_1());
		}
	)
;

// Entry rule entryRuleFlipFilter
entryRuleFlipFilter returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getFlipFilterRule()); }
	iv_ruleFlipFilter=ruleFlipFilter
	{ $current=$iv_ruleFlipFilter.current; }
	EOF;

// Rule FlipFilter
ruleFlipFilter returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='flip'
		{
			newLeafNode(otherlv_0, grammarAccess.getFlipFilterAccess().getFlipKeyword_0());
		}
		(
			(
				(
					lv_orientation_1_1='h'
					{
						newLeafNode(lv_orientation_1_1, grammarAccess.getFlipFilterAccess().getOrientationHKeyword_1_0_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getFlipFilterRule());
						}
						setWithLastConsumed($current, "orientation", lv_orientation_1_1, null);
					}
					    |
					lv_orientation_1_2='horizontal'
					{
						newLeafNode(lv_orientation_1_2, grammarAccess.getFlipFilterAccess().getOrientationHorizontalKeyword_1_0_1());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getFlipFilterRule());
						}
						setWithLastConsumed($current, "orientation", lv_orientation_1_2, null);
					}
					    |
					lv_orientation_1_3='v'
					{
						newLeafNode(lv_orientation_1_3, grammarAccess.getFlipFilterAccess().getOrientationVKeyword_1_0_2());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getFlipFilterRule());
						}
						setWithLastConsumed($current, "orientation", lv_orientation_1_3, null);
					}
					    |
					lv_orientation_1_4='vertical'
					{
						newLeafNode(lv_orientation_1_4, grammarAccess.getFlipFilterAccess().getOrientationVerticalKeyword_1_0_3());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getFlipFilterRule());
						}
						setWithLastConsumed($current, "orientation", lv_orientation_1_4, null);
					}
				)
			)
		)
	)
;

RULE_LEFT_BRACKET : '{';

RULE_RIGHT_BRACKET : '}';

RULE_PERCENTAGE : ('1'..'9' ('0'..'9')?|'100');

RULE_FLOAT : RULE_INT '.' RULE_INT;

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
