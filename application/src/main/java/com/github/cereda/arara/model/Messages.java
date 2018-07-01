/**
 * Arara, the cool TeX automation tool
 * Copyright (c) 2012 -- 2018, Paulo Roberto Massa Cereda 
 * All rights reserved.
 *
 * Redistribution and  use in source  and binary forms, with  or without
 * modification, are  permitted provided  that the  following conditions
 * are met:
 *
 * 1. Redistributions  of source  code must  retain the  above copyright
 * notice, this list of conditions and the following disclaimer.
 *
 * 2. Redistributions in binary form  must reproduce the above copyright
 * notice, this list  of conditions and the following  disclaimer in the
 * documentation and/or other materials provided with the distribution.
 *
 * 3. Neither  the name  of the  project's author nor  the names  of its
 * contributors may be used to  endorse or promote products derived from
 * this software without specific prior written permission.
 *
 * THIS SOFTWARE IS  PROVIDED BY THE COPYRIGHT  HOLDERS AND CONTRIBUTORS
 * "AS IS"  AND ANY  EXPRESS OR IMPLIED  WARRANTIES, INCLUDING,  BUT NOT
 * LIMITED  TO, THE  IMPLIED WARRANTIES  OF MERCHANTABILITY  AND FITNESS
 * FOR  A PARTICULAR  PURPOSE  ARE  DISCLAIMED. IN  NO  EVENT SHALL  THE
 * COPYRIGHT HOLDER OR CONTRIBUTORS BE  LIABLE FOR ANY DIRECT, INDIRECT,
 * INCIDENTAL, SPECIAL, EXEMPLARY,  OR CONSEQUENTIAL DAMAGES (INCLUDING,
 * BUT  NOT LIMITED  TO, PROCUREMENT  OF SUBSTITUTE  GOODS OR  SERVICES;
 * LOSS  OF USE,  DATA, OR  PROFITS; OR  BUSINESS INTERRUPTION)  HOWEVER
 * CAUSED AND  ON ANY THEORY  OF LIABILITY, WHETHER IN  CONTRACT, STRICT
 * LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY
 * WAY  OUT  OF  THE USE  OF  THIS  SOFTWARE,  EVEN  IF ADVISED  OF  THE
 * POSSIBILITY OF SUCH DAMAGE.
 */
package com.github.cereda.arara.model;

import ch.qos.cal10n.BaseName;
import ch.qos.cal10n.Locale;
import ch.qos.cal10n.LocaleData;

/**
 * This enumeration contains all application messages.
 * @author Paulo Roberto Massa Cereda
 * @version 4.0
 * @since 4.0
 */
@BaseName("com.github.cereda.arara.localization.messages")
@LocaleData({
    @Locale(value = "de", charset = "UTF-8"),
    @Locale(value = "en", charset = "UTF-8"),
    @Locale(value = "en_QN", charset = "UTF-8"),
    @Locale(value = "it", charset = "UTF-8"),
    @Locale(value = "nl", charset = "UTF-8"),
    @Locale(value = "pt_BR", charset = "UTF-8")
})
public enum Messages {

    ERROR_BASENAME_NOT_A_FILE,
    ERROR_CALCULATEHASH_IO_EXCEPTION,
    ERROR_CHECKBOOLEAN_NOT_VALID_BOOLEAN,
    ERROR_CHECKOS_INVALID_OPERATING_SYSTEM,
    ERROR_CHECKREGEX_IO_EXCEPTION,
    ERROR_CONFIGURATION_GENERIC_ERROR,
    ERROR_CONFIGURATION_INVALID_YAML,
    ERROR_CONFIGURATION_LOOPS_INVALID_RANGE,
    ERROR_DISCOVERFILE_FILE_NOT_FOUND,
    ERROR_EVALUATE_COMPILATION_FAILED,
    ERROR_EVALUATE_NOT_BOOLEAN_VALUE,
    ERROR_EXTRACTOR_IO_ERROR,
    ERROR_FILETYPE_NOT_A_FILE,
    ERROR_FILETYPE_UNKNOWN_EXTENSION,
    ERROR_GETAPPLICATIONPATH_ENCODING_EXCEPTION,
    ERROR_GETCANONICALFILE_IO_EXCEPTION,
    ERROR_GETCANONICALPATH_IO_EXCEPTION,
    ERROR_GETPARENTCANONICALPATH_IO_EXCEPTION,
    ERROR_INTERPRETER_ARGUMENT_IS_REQUIRED,
    ERROR_INTERPRETER_COMMAND_RUNTIME_ERROR,
    ERROR_INTERPRETER_DEFAULT_VALUE_RUNTIME_ERROR,
    ERROR_INTERPRETER_EXIT_RUNTIME_ERROR,
    ERROR_INTERPRETER_FLAG_RUNTIME_EXCEPTION,
    ERROR_INTERPRETER_NULL_COMMAND,
    ERROR_INTERPRETER_RULE_NOT_FOUND,
    ERROR_INTERPRETER_UNKNOWN_KEYS,
    ERROR_INTERPRETER_WRONG_EXIT_CLOSURE_RETURN,
    ERROR_LANGUAGE_INVALID_CODE,
    ERROR_LOAD_COULD_NOT_LOAD_XML,
    ERROR_PARSER_INVALID_PREAMBLE,
    ERROR_PARSER_LOOPS_INVALID_RANGE,
    ERROR_PARSER_LOOPS_NAN,
    ERROR_PARSER_TIMEOUT_INVALID_RANGE,
    ERROR_PARSER_TIMEOUT_NAN,
    ERROR_PARSERULE_GENERIC_ERROR,
    ERROR_PARSERULE_INVALID_YAML,
    ERROR_REPLICATELIST_MISSING_FORMAT_ARGUMENTS_EXCEPTION,
    ERROR_RULE_IDENTIFIER_AND_PATH,
    ERROR_RUN_GENERIC_EXCEPTION,
    ERROR_RUN_INTERRUPTED_EXCEPTION,
    ERROR_RUN_INVALID_EXIT_VALUE_EXCEPTION,
    ERROR_RUN_IO_EXCEPTION,
    ERROR_RUN_TIMEOUT_EXCEPTION,
    ERROR_RUN_TIMEOUT_INVALID_RANGE,
    ERROR_SAVE_COULD_NOT_SAVE_XML,
    ERROR_SESSION_OBTAIN_UNKNOWN_KEY,
    ERROR_SESSION_REMOVE_UNKNOWN_KEY,
    ERROR_TRIGGER_ACTION_NOT_FOUND,
    ERROR_TRIGGER_CALL_EXCEPTION,
    ERROR_VALIDATE_EMPTY_FILES_LIST,
    ERROR_VALIDATE_FILE_IS_RESERVED,
    ERROR_VALIDATE_FILES_IS_NOT_A_LIST,
    ERROR_VALIDATE_INVALID_DIRECTIVE_FORMAT,
    ERROR_VALIDATE_NO_DIRECTIVES_FOUND,
    ERROR_VALIDATE_ORPHAN_LINEBREAK,
    ERROR_VALIDATE_REFERENCE_IS_RESERVED,
    ERROR_VALIDATE_YAML_EXCEPTION,
    ERROR_VALIDATEBODY_ARGUMENT_ID_IS_RESERVED,
    ERROR_VALIDATEBODY_ARGUMENTS_LIST,
    ERROR_VALIDATEBODY_DUPLICATE_ARGUMENT_IDENTIFIERS,
    ERROR_VALIDATEBODY_MISSING_KEYS,
    ERROR_VALIDATEBODY_NULL_ARGUMENT_ID,
    ERROR_VALIDATEBODY_NULL_COMMAND,
    ERROR_VALIDATEBODY_NULL_COMMANDS_LIST,
    ERROR_VALIDATEHEADER_NULL_ID,
    ERROR_VALIDATEHEADER_NULL_NAME,
    ERROR_VALIDATEHEADER_WRONG_IDENTIFIER,
    ERROR_VELOCITY_FILE_NOT_FOUND,
    ERROR_VELOCITY_PARSE_EXCEPTION,
    ERROR_VELOCITY_METHOD_INVOCATION_EXCEPTION,
    ERROR_VELOCITY_IO_EXCEPTION,
    INFO_DISPLAY_EXCEPTION_MORE_DETAILS,
    INFO_DISPLAY_EXECUTION_TIME,
    INFO_DISPLAY_FILE_INFORMATION,
    INFO_INTERPRETER_DRYRUN_MODE_SYSTEM_COMMAND,
    INFO_INTERPRETER_DRYRUN_MODE_TRIGGER_MODE,
    INFO_INTERPRETER_VERBOSE_MODE_TRIGGER_MODE,
    INFO_LABEL_AUTHOR,
    INFO_LABEL_AUTHORS,
    INFO_LABEL_CONDITIONAL,
    INFO_LABEL_NO_AUTHORS,
    INFO_LABEL_ON_DETAILS,
    INFO_LABEL_ON_ERROR,
    INFO_LABEL_ON_FAILURE,
    INFO_LABEL_ON_SUCCESS,
    INFO_LABEL_UNNAMED_TASK,
    INFO_PARSER_ALL_RIGHTS_RESERVED,
    INFO_PARSER_DRYRUN_MODE_DESCRIPTION,
    INFO_PARSER_HELP_DESCRIPTION,
    INFO_PARSER_LANGUAGE_DESCRIPTION,
    INFO_PARSER_LOG_DESCRIPTION,
    INFO_PARSER_LOOPS_DESCRIPTION,
    INFO_PARSER_NOTES,
    INFO_PARSER_ONLY_HEADER,
    INFO_PARSER_PREAMBLE_DESCRIPTION,
    INFO_PARSER_SILENT_MODE_DESCRIPTION,
    INFO_PARSER_TIMEOUT_DESCRIPTION,
    INFO_PARSER_VERBOSE_MODE_DESCRIPTION,
    INFO_PARSER_VERSION_DESCRIPTION,
    LOG_INFO_BEGIN_BUFFER,
    LOG_INFO_DIRECTIVES_BLOCK,
    LOG_INFO_END_BUFFER,
    LOG_INFO_INTERPRET_RULE,
    LOG_INFO_INTERPRET_TASK,
    LOG_INFO_POTENTIAL_DIRECTIVE_FOUND,
    LOG_INFO_POTENTIAL_PATTERN_FOUND,
    LOG_INFO_RULE_LOCATION,
    LOG_INFO_SYSTEM_COMMAND,
    LOG_INFO_TASK_RESULT,
    LOG_INFO_VALIDATED_DIRECTIVES,
    LOG_INFO_WELCOME_MESSAGE,
    ERROR_CONFIGURATION_FILETYPE_MISSING_EXTENSION
    
}
