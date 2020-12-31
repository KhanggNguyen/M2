/*
 * generated by Xtext 2.23.0
 */
grammar InternalMelangeurmodel;

options {
	superClass=AbstractInternalContentAssistParser;
}

@lexer::header {
package org.example.melangeurmodel.ide.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;
}

@parser::header {
package org.example.melangeurmodel.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import org.example.melangeurmodel.services.MelangeurmodelGrammarAccess;

}
@parser::members {
	private MelangeurmodelGrammarAccess grammarAccess;

	public void setGrammarAccess(MelangeurmodelGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}

	@Override
	protected Grammar getGrammar() {
		return grammarAccess.getGrammar();
	}

	@Override
	protected String getValueForTokenName(String tokenName) {
		return tokenName;
	}
}

// Entry rule entryRuleModel
entryRuleModel
:
{ before(grammarAccess.getModelRule()); }
	 ruleModel
{ after(grammarAccess.getModelRule()); } 
	 EOF 
;

// Rule Model
ruleModel 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getModelAccess().getInstructionAssignment()); }
		(rule__Model__InstructionAssignment)*
		{ after(grammarAccess.getModelAccess().getInstructionAssignment()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleInstruction
entryRuleInstruction
:
{ before(grammarAccess.getInstructionRule()); }
	 ruleInstruction
{ after(grammarAccess.getInstructionRule()); } 
	 EOF 
;

// Rule Instruction
ruleInstruction 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getInstructionAccess().getAlternatives()); }
		(rule__Instruction__Alternatives)
		{ after(grammarAccess.getInstructionAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleMove
entryRuleMove
:
{ before(grammarAccess.getMoveRule()); }
	 ruleMove
{ after(grammarAccess.getMoveRule()); } 
	 EOF 
;

// Rule Move
ruleMove 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getMoveAccess().getGroup()); }
		(rule__Move__Group__0)
		{ after(grammarAccess.getMoveAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleDatatype
entryRuleDatatype
:
{ before(grammarAccess.getDatatypeRule()); }
	 ruleDatatype
{ after(grammarAccess.getDatatypeRule()); } 
	 EOF 
;

// Rule Datatype
ruleDatatype 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getDatatypeAccess().getGroup()); }
		(rule__Datatype__Group__0)
		{ after(grammarAccess.getDatatypeAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleVariable
entryRuleVariable
:
{ before(grammarAccess.getVariableRule()); }
	 ruleVariable
{ after(grammarAccess.getVariableRule()); } 
	 EOF 
;

// Rule Variable
ruleVariable 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getVariableAccess().getGroup()); }
		(rule__Variable__Group__0)
		{ after(grammarAccess.getVariableAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleCup
entryRuleCup
:
{ before(grammarAccess.getCupRule()); }
	 ruleCup
{ after(grammarAccess.getCupRule()); } 
	 EOF 
;

// Rule Cup
ruleCup 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getCupAccess().getGroup()); }
		(rule__Cup__Group__0)
		{ after(grammarAccess.getCupAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleClean
entryRuleClean
:
{ before(grammarAccess.getCleanRule()); }
	 ruleClean
{ after(grammarAccess.getCleanRule()); } 
	 EOF 
;

// Rule Clean
ruleClean 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getCleanAccess().getGroup()); }
		(rule__Clean__Group__0)
		{ after(grammarAccess.getCleanAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Instruction__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getInstructionAccess().getMoveParserRuleCall_0()); }
		ruleMove
		{ after(grammarAccess.getInstructionAccess().getMoveParserRuleCall_0()); }
	)
	|
	(
		{ before(grammarAccess.getInstructionAccess().getCleanParserRuleCall_1()); }
		ruleClean
		{ after(grammarAccess.getInstructionAccess().getCleanParserRuleCall_1()); }
	)
	|
	(
		{ before(grammarAccess.getInstructionAccess().getDatatypeParserRuleCall_2()); }
		ruleDatatype
		{ after(grammarAccess.getInstructionAccess().getDatatypeParserRuleCall_2()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Move__TypeAlternatives_1_2_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getMoveAccess().getTypeLessKeyword_1_2_0_0()); }
		'less'
		{ after(grammarAccess.getMoveAccess().getTypeLessKeyword_1_2_0_0()); }
	)
	|
	(
		{ before(grammarAccess.getMoveAccess().getTypeMoreKeyword_1_2_0_1()); }
		'more'
		{ after(grammarAccess.getMoveAccess().getTypeMoreKeyword_1_2_0_1()); }
	)
	|
	(
		{ before(grammarAccess.getMoveAccess().getTypeEqualKeyword_1_2_0_2()); }
		'equal'
		{ after(grammarAccess.getMoveAccess().getTypeEqualKeyword_1_2_0_2()); }
	)
	|
	(
		{ before(grammarAccess.getMoveAccess().getTypeDiffKeyword_1_2_0_3()); }
		'diff'
		{ after(grammarAccess.getMoveAccess().getTypeDiffKeyword_1_2_0_3()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Move__FilterAlternatives_7_2_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getMoveAccess().getFilterAKeyword_7_2_0_0()); }
		'A'
		{ after(grammarAccess.getMoveAccess().getFilterAKeyword_7_2_0_0()); }
	)
	|
	(
		{ before(grammarAccess.getMoveAccess().getFilterBKeyword_7_2_0_1()); }
		'B'
		{ after(grammarAccess.getMoveAccess().getFilterBKeyword_7_2_0_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Move__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Move__Group__0__Impl
	rule__Move__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Move__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getMoveAccess().getMoveAssignment_0()); }
	(rule__Move__MoveAssignment_0)
	{ after(grammarAccess.getMoveAccess().getMoveAssignment_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Move__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Move__Group__1__Impl
	rule__Move__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Move__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getMoveAccess().getGroup_1()); }
	(rule__Move__Group_1__0)?
	{ after(grammarAccess.getMoveAccess().getGroup_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Move__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Move__Group__2__Impl
	rule__Move__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Move__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getMoveAccess().getGroup_2()); }
	(rule__Move__Group_2__0)?
	{ after(grammarAccess.getMoveAccess().getGroup_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Move__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Move__Group__3__Impl
	rule__Move__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__Move__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getMoveAccess().getFromKeyword_3()); }
	'from'
	{ after(grammarAccess.getMoveAccess().getFromKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Move__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Move__Group__4__Impl
	rule__Move__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__Move__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getMoveAccess().getFromAssignment_4()); }
	(rule__Move__FromAssignment_4)
	{ after(grammarAccess.getMoveAccess().getFromAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Move__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Move__Group__5__Impl
	rule__Move__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__Move__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getMoveAccess().getToKeyword_5()); }
	'to'
	{ after(grammarAccess.getMoveAccess().getToKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Move__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Move__Group__6__Impl
	rule__Move__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__Move__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getMoveAccess().getToAssignment_6()); }
	(rule__Move__ToAssignment_6)
	{ after(grammarAccess.getMoveAccess().getToAssignment_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Move__Group__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Move__Group__7__Impl
	rule__Move__Group__8
;
finally {
	restoreStackSize(stackSize);
}

rule__Move__Group__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getMoveAccess().getGroup_7()); }
	(rule__Move__Group_7__0)?
	{ after(grammarAccess.getMoveAccess().getGroup_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Move__Group__8
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Move__Group__8__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Move__Group__8__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getMoveAccess().getGroup_8()); }
	(rule__Move__Group_8__0)?
	{ after(grammarAccess.getMoveAccess().getGroup_8()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Move__Group_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Move__Group_1__0__Impl
	rule__Move__Group_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Move__Group_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getMoveAccess().getScanKeyword_1_0()); }
	'scan'
	{ after(grammarAccess.getMoveAccess().getScanKeyword_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Move__Group_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Move__Group_1__1__Impl
	rule__Move__Group_1__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Move__Group_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getMoveAccess().getIfKeyword_1_1()); }
	'if'
	{ after(grammarAccess.getMoveAccess().getIfKeyword_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Move__Group_1__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Move__Group_1__2__Impl
	rule__Move__Group_1__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Move__Group_1__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getMoveAccess().getTypeAssignment_1_2()); }
	(rule__Move__TypeAssignment_1_2)
	{ after(grammarAccess.getMoveAccess().getTypeAssignment_1_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Move__Group_1__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Move__Group_1__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Move__Group_1__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getMoveAccess().getQtyCupAssignment_1_3()); }
	(rule__Move__QtyCupAssignment_1_3)
	{ after(grammarAccess.getMoveAccess().getQtyCupAssignment_1_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Move__Group_2__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Move__Group_2__0__Impl
	rule__Move__Group_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Move__Group_2__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getMoveAccess().getQtyAssignment_2_0()); }
	(rule__Move__QtyAssignment_2_0)
	{ after(grammarAccess.getMoveAccess().getQtyAssignment_2_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Move__Group_2__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Move__Group_2__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Move__Group_2__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getMoveAccess().getMlKeyword_2_1()); }
	'ml'
	{ after(grammarAccess.getMoveAccess().getMlKeyword_2_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Move__Group_7__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Move__Group_7__0__Impl
	rule__Move__Group_7__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Move__Group_7__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getMoveAccess().getWithKeyword_7_0()); }
	'with'
	{ after(grammarAccess.getMoveAccess().getWithKeyword_7_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Move__Group_7__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Move__Group_7__1__Impl
	rule__Move__Group_7__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Move__Group_7__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getMoveAccess().getFilterKeyword_7_1()); }
	'filter'
	{ after(grammarAccess.getMoveAccess().getFilterKeyword_7_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Move__Group_7__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Move__Group_7__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Move__Group_7__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getMoveAccess().getFilterAssignment_7_2()); }
	(rule__Move__FilterAssignment_7_2)
	{ after(grammarAccess.getMoveAccess().getFilterAssignment_7_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Move__Group_8__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Move__Group_8__0__Impl
	rule__Move__Group_8__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Move__Group_8__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getMoveAccess().getWaitKeyword_8_0()); }
	'wait'
	{ after(grammarAccess.getMoveAccess().getWaitKeyword_8_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Move__Group_8__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Move__Group_8__1__Impl
	rule__Move__Group_8__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Move__Group_8__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getMoveAccess().getBeforeKeyword_8_1()); }
	'before'
	{ after(grammarAccess.getMoveAccess().getBeforeKeyword_8_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Move__Group_8__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Move__Group_8__2__Impl
	rule__Move__Group_8__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Move__Group_8__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getMoveAccess().getCleanKeyword_8_2()); }
	'clean'
	{ after(grammarAccess.getMoveAccess().getCleanKeyword_8_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Move__Group_8__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Move__Group_8__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Move__Group_8__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getMoveAccess().getTimeAssignment_8_3()); }
	(rule__Move__TimeAssignment_8_3)
	{ after(grammarAccess.getMoveAccess().getTimeAssignment_8_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Datatype__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Datatype__Group__0__Impl
	rule__Datatype__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Datatype__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDatatypeAccess().getDatatypeKeyword_0()); }
	'datatype'
	{ after(grammarAccess.getDatatypeAccess().getDatatypeKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Datatype__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Datatype__Group__1__Impl
	rule__Datatype__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Datatype__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDatatypeAccess().getNameAssignment_1()); }
	(rule__Datatype__NameAssignment_1)
	{ after(grammarAccess.getDatatypeAccess().getNameAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Datatype__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Datatype__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Datatype__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDatatypeAccess().getVarnameAssignment_2()); }
	(rule__Datatype__VarnameAssignment_2)
	{ after(grammarAccess.getDatatypeAccess().getVarnameAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Variable__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Variable__Group__0__Impl
	rule__Variable__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Variable__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVariableAccess().getVariableKeyword_0()); }
	'variable'
	{ after(grammarAccess.getVariableAccess().getVariableKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Variable__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Variable__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Variable__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVariableAccess().getNameAssignment_1()); }
	(rule__Variable__NameAssignment_1)
	{ after(grammarAccess.getVariableAccess().getNameAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Cup__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Cup__Group__0__Impl
	rule__Cup__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Cup__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCupAccess().getCupKeyword_0()); }
	'cup'
	{ after(grammarAccess.getCupAccess().getCupKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Cup__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Cup__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Cup__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCupAccess().getNrAssignment_1()); }
	(rule__Cup__NrAssignment_1)
	{ after(grammarAccess.getCupAccess().getNrAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Clean__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Clean__Group__0__Impl
	rule__Clean__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Clean__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCleanAccess().getCleanAction_0()); }
	()
	{ after(grammarAccess.getCleanAccess().getCleanAction_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Clean__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Clean__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Clean__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCleanAccess().getCleanupKeyword_1()); }
	'cleanup'
	{ after(grammarAccess.getCleanAccess().getCleanupKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Model__InstructionAssignment
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getModelAccess().getInstructionInstructionParserRuleCall_0()); }
		ruleInstruction
		{ after(grammarAccess.getModelAccess().getInstructionInstructionParserRuleCall_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Move__MoveAssignment_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getMoveAccess().getMoveMoveKeyword_0_0()); }
		(
			{ before(grammarAccess.getMoveAccess().getMoveMoveKeyword_0_0()); }
			'move'
			{ after(grammarAccess.getMoveAccess().getMoveMoveKeyword_0_0()); }
		)
		{ after(grammarAccess.getMoveAccess().getMoveMoveKeyword_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Move__TypeAssignment_1_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getMoveAccess().getTypeAlternatives_1_2_0()); }
		(rule__Move__TypeAlternatives_1_2_0)
		{ after(grammarAccess.getMoveAccess().getTypeAlternatives_1_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Move__QtyCupAssignment_1_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getMoveAccess().getQtyCupINTTerminalRuleCall_1_3_0()); }
		RULE_INT
		{ after(grammarAccess.getMoveAccess().getQtyCupINTTerminalRuleCall_1_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Move__QtyAssignment_2_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getMoveAccess().getQtyINTTerminalRuleCall_2_0_0()); }
		RULE_INT
		{ after(grammarAccess.getMoveAccess().getQtyINTTerminalRuleCall_2_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Move__FromAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getMoveAccess().getFromCupParserRuleCall_4_0()); }
		ruleCup
		{ after(grammarAccess.getMoveAccess().getFromCupParserRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Move__ToAssignment_6
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getMoveAccess().getToCupParserRuleCall_6_0()); }
		ruleCup
		{ after(grammarAccess.getMoveAccess().getToCupParserRuleCall_6_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Move__FilterAssignment_7_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getMoveAccess().getFilterAlternatives_7_2_0()); }
		(rule__Move__FilterAlternatives_7_2_0)
		{ after(grammarAccess.getMoveAccess().getFilterAlternatives_7_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Move__TimeAssignment_8_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getMoveAccess().getTimeINTTerminalRuleCall_8_3_0()); }
		RULE_INT
		{ after(grammarAccess.getMoveAccess().getTimeINTTerminalRuleCall_8_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Datatype__NameAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDatatypeAccess().getNameIDTerminalRuleCall_1_0()); }
		RULE_ID
		{ after(grammarAccess.getDatatypeAccess().getNameIDTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Datatype__VarnameAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDatatypeAccess().getVarnameVariableParserRuleCall_2_0()); }
		ruleVariable
		{ after(grammarAccess.getDatatypeAccess().getVarnameVariableParserRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Variable__NameAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVariableAccess().getNameIDTerminalRuleCall_1_0()); }
		RULE_ID
		{ after(grammarAccess.getVariableAccess().getNameIDTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Cup__NrAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getCupAccess().getNrINTTerminalRuleCall_1_0()); }
		RULE_INT
		{ after(grammarAccess.getCupAccess().getNrINTTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;