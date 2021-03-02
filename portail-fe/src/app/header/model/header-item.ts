export interface HeaderItem {
    name: string ;
    link: string;
    label?: string;
    subItems?: HeaderItem[];
}