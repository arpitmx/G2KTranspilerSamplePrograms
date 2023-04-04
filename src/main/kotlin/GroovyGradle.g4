grammar GroovyGradle;

dependencies_section : 'dependencies' '{' dependency+ '}';

dependency :  IMPLEMENTATION STRING_LITERAL
            | TEST_IMPLEMENTATION STRING_LITERAL
            | ANDROID_TEST_IMPLEMENTATION STRING_LITERAL;

STRING_LITERAL : '\'' (~'\'')* '\'';

IMPLEMENTATION : 'implementation' SPACES?;
TEST_IMPLEMENTATION : 'testImplementation' SPACES?;
ANDROID_TEST_IMPLEMENTATION : 'androidTestImplementation' SPACES?;

SPACES : [ \t\r\n]+ -> skip;


